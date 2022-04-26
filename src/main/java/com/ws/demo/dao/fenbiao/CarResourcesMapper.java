package com.ws.demo.dao.fenbiao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ws.demo.config.DataSource;
import com.ws.demo.constant.DBNameType;
import com.ws.demo.entity.CarResourcesEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 资源表 Mapper 接口
 * </p>
 *
 * @author pansiheng
 * @since 2020-12-25
 */
public interface CarResourcesMapper extends BaseMapper<CarResourcesEntity> {
    @DataSource(DBNameType.chake)
    List<CarResourcesEntity> selectCarResources(@Param("reportId") Integer reportId);

    int batchInsert(@Param("list") List<CarResourcesEntity> list);

    int batchDelete(@Param("reportId") Integer reportId, @Param("moduleId") Integer moduleId);
}
