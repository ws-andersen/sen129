package com.ws.demo.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.DynamicTableNameParser;
import com.baomidou.mybatisplus.extension.parsers.ITableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.ws.demo.constant.DBNameType;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 数据源配置
 *
 * @author ws
 * @date 2022/4/26 18:03
 */
@Configuration
public class DataSourceConfig {
    @Autowired
    private DataSource transtarAuction;

    @Autowired
    private DataSource chake;
    @Autowired
    private DataSource dBNew;

    public static ThreadLocal<String> curTableName = new ThreadLocal<>();


    @Bean
    @Primary
    public DataSource dynamicDataSource() {
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put(DBNameType.dBNew, dBNew);
        dataSourceMap.put(DBNameType.chake, chake);
        dataSourceMap.put(DBNameType.transtarAuction, transtarAuction);

        //设置动态数据源
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        dynamicDataSource.setDefaultTargetDataSource(chake);

        return dynamicDataSource;
    }

    @Bean
    public MybatisConfiguration mybatisConfiguration() {
        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
        // 关闭自动驼峰
        //mybatisConfiguration.setMapUnderscoreToCamelCase(false);
        // 打印sql日志
//        mybatisConfiguration.setLogImpl(StdOutImpl.class);
        return mybatisConfiguration;
    }

    /**
     * 分页插件配置
     * @return
     */
    @Bean
    PaginationInterceptor paginationInterceptor(DynamicTableNameParser dynamicTableNameParser) {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");
        // 创建SQL解析器集合
        List<ISqlParser> sqlParserList = new ArrayList<>();

        sqlParserList.add(dynamicTableNameParser);//装载动态表名配置
        paginationInterceptor.setSqlParserList(sqlParserList);

        return paginationInterceptor;
    }

    /**
     * 配置 mybatis-plus 的 MybatisSqlSessionFactoryBean
     */
    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(MybatisConfiguration mybatisConfiguration,PaginationInterceptor paginationInterceptor) throws IOException {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        // 配置数据源
//        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        // 指定 mapper.xml 扫描路径
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper123/**/*.xml"));

        // 定义 MP 全局策略
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setBanner(true);
        GlobalConfig.DbConfig dbConfig = new GlobalConfig.DbConfig();
        globalConfig.setDbConfig(dbConfig);

        dbConfig.setIdType(IdType.AUTO); // 全局id使用主键自增
        dbConfig.setTableUnderline(true);// 表为下划线方式命名
        sqlSessionFactoryBean.setGlobalConfig(globalConfig);

        //mpconfig
        sqlSessionFactoryBean.setConfiguration(mybatisConfiguration);

        // 拦截器
        Interceptor[] plugins = {paginationInterceptor};
        sqlSessionFactoryBean.setPlugins(plugins);


        return sqlSessionFactoryBean;
    }

    /**
     * 配置spring的声明式事务
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    /**
     * 动态表名配置
     * @return
     */
    @Bean
    DynamicTableNameParser getDynamicTableNameParser(){
        // 动态表名SQL解析器
        DynamicTableNameParser dynamicTableNameParser = new DynamicTableNameParser();
        Map<String, ITableNameHandler> tableNameHandlerMap = new HashMap<>();
        // Map的key就是需要替换的原始表名
        tableNameHandlerMap.put("mp_dt_car_resources", (metaObject, sql, tableName) -> {
            // 自定义表名规则，或者从配置文件、request上下文中读取
            return getTableName();
        });
        tableNameHandlerMap.put("mp_dt_car_detail_spot", (metaObject, sql, tableName) -> {
            // 自定义表名规则，或者从配置文件、request上下文中读取
            return getTableName();
        });
        dynamicTableNameParser.setTableNameHandlerMap(tableNameHandlerMap);
        return dynamicTableNameParser;
    }

    private String getTableName(){
        String newTableName =curTableName.get();
        curTableName.remove();
        return newTableName;
    }

}
