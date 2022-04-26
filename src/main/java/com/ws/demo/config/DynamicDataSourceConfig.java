package com.ws.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ws.demo.constant.DBNameType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author wangsen
 * @description
 * @date 2022/4/26 18:03
 */
@Configuration
public class DynamicDataSourceConfig {

    @Value("${mysql.driver-class-name}")
    private String mysqlDriver;

    // chake
    @Value("${mysql.chake.username}")
    private String chakeUserName;
    @Value("${mysql.chake.password}")
    private String chakePassword;
    @Value("${mysql.chake.url}")
    private String chakeUrl;


    /**
     * sqlserver
     */

    @Value("${sqlserver.read.driverClassName}")
    private String sqlserverdriverClassName;
    @Value("${sqlserver.read.initialSize}")
    private int sqlserverinitialSize;
    @Value("${sqlserver.read.maxActive}")
    private int sqlservermaxActive;
    @Value("${sqlserver.read.maxIdle}")
    private int sqlservermaxIdle;
    @Value("${sqlserver.read.minIdle}")
    private String sqlserverminIdle;
    @Value("${sqlserver.read.logAbandoned}")
    private boolean sqlserverlogAbandoned;
    @Value("${sqlserver.read.removeAbandoned}")
    private boolean sqlserverremoveAbandoned;
    @Value("${sqlserver.read.removeAbandonedTimeout}")
    private int sqlserverremoveAbandonedTimeout;
    @Value("${sqlserver.read.maxWait}")
    private long sqlservermaxWait;
    @Value("${sqlserver.read.testOnBorrow}")
    private boolean sqlservertestOnBorrow;
    @Value("${sqlserver.read.testWhileIdle}")
    private boolean sqlservertestWhileIdle;
    @Value("${sqlserver.read.timeBetweenEvictionRunsMillis}")
    private long sqlservertimeBetweenEvictionRunsMillis;
    @Value("${sqlserver.read.minEvictableIdleTimeMillis}")
    private long sqlserverminEvictableIdleTimeMillis;
    @Value("${sqlserver.read.validationQuery}")
    private String sqlservervalidationQuery;

    //TranstarAuction2011_120db
    @Value("${sqlserver.transtarauction2011.url}")
    private String transtarAuctionUrl;
    @Value("${sqlserver.transtarauction2011.username}")
    private String transtarAuctionName;
    @Value("${sqlserver.transtarauction2011.password}")
    private String transtarAuctionPassword;

    //AutoDetectDBNew
    @Value("${sqlserver.autoDetectDBNew.url}")
    private String dBNewUrl;
    @Value("${sqlserver.autoDetectDBNew.username}")
    private String dBNewName;
    @Value("${sqlserver.autoDetectDBNew.password}")
    private String dBNewPassword;

    @Bean(DBNameType.transtarAuction)
    public DataSource transtarAuction() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(sqlserverinitialSize);
        dataSource.setMaxActive(sqlservermaxActive);
        dataSource.setMaxIdle(sqlservermaxIdle);
        dataSource.setLogAbandoned(sqlserverlogAbandoned);
        dataSource.setRemoveAbandoned(sqlserverremoveAbandoned);
        dataSource.setRemoveAbandonedTimeout(sqlserverremoveAbandonedTimeout);
        dataSource.setMaxWait(sqlservermaxWait);
        dataSource.setTestOnBorrow(sqlservertestOnBorrow);
        dataSource.setTestWhileIdle(sqlservertestWhileIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(sqlservertimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(sqlserverminEvictableIdleTimeMillis);
        dataSource.setValidationQuery(sqlservervalidationQuery);

        dataSource.setDriverClassName(sqlserverdriverClassName);
        dataSource.setUrl(transtarAuctionUrl);
        dataSource.setUsername(transtarAuctionName);
        dataSource.setPassword(transtarAuctionPassword);

        return dataSource;
    }

    @Bean(DBNameType.dBNew)
    public DataSource dBNew(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(sqlserverinitialSize);
        dataSource.setMaxActive(sqlservermaxActive);
        dataSource.setMaxIdle(sqlservermaxIdle);
        dataSource.setLogAbandoned(sqlserverlogAbandoned);
        dataSource.setRemoveAbandoned(sqlserverremoveAbandoned);
        dataSource.setRemoveAbandonedTimeout(sqlserverremoveAbandonedTimeout);
        dataSource.setMaxWait(sqlservermaxWait);
        dataSource.setTestOnBorrow(sqlservertestOnBorrow);
        dataSource.setTestWhileIdle(sqlservertestWhileIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(sqlservertimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(sqlserverminEvictableIdleTimeMillis);
        dataSource.setValidationQuery(sqlservervalidationQuery);

        dataSource.setDriverClassName(sqlserverdriverClassName);
        dataSource.setUrl(dBNewUrl);
        dataSource.setUsername(dBNewName);
        dataSource.setPassword(dBNewPassword);

        return dataSource;
    }

    @Bean(DBNameType.chake)
    public DataSource chake() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(sqlserverinitialSize);
        dataSource.setMaxActive(sqlservermaxActive);
        dataSource.setMaxIdle(sqlservermaxIdle);
        dataSource.setLogAbandoned(sqlserverlogAbandoned);
        dataSource.setRemoveAbandoned(sqlserverremoveAbandoned);
        dataSource.setRemoveAbandonedTimeout(sqlserverremoveAbandonedTimeout);
        dataSource.setMaxWait(sqlservermaxWait);
        dataSource.setTestOnBorrow(sqlservertestOnBorrow);
        dataSource.setTestWhileIdle(sqlservertestWhileIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(sqlservertimeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(sqlserverminEvictableIdleTimeMillis);
        dataSource.setValidationQuery(sqlservervalidationQuery);

        dataSource.setDriverClassName(mysqlDriver);
        dataSource.setUrl(chakeUrl);
        dataSource.setUsername(chakeUserName);
        dataSource.setPassword(chakePassword);

        return dataSource;
    }
}
