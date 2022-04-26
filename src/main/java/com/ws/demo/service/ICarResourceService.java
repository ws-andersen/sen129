package com.ws.demo.service;

import com.ws.demo.dto.CarResourcesConditionDTO;
import com.ws.demo.dto.CarResourcesQueryCondition;
import com.ws.demo.dto.base.PhpHonorResult;
import com.ws.demo.entity.CarResourcesEntity;

import java.util.List;

/**
 * Created by z.l on 2021/03/26.
 */
public interface ICarResourceService {

    /**
     * 返回车辆检测资源
     *
     * @param carResourcesConditionDTO 查询构造器
     * @param isPlus
     * @return CarResourcesEntity
     */
    List<CarResourcesEntity> getCarResourceByCondition(CarResourcesConditionDTO carResourcesConditionDTO, boolean isPlus);

    /**
     * 批量插入检测数据
     *
     * @param list                    待插入数据
     * @param dtCarResourcesTableName 分区表名
     * @return CarResourcesEntity列表插入成功数量
     */
    int batchInsert(List<CarResourcesEntity> list, String dtCarResourcesTableName);

    /**
     * 根据report_id和module_id批量删除对应检测资源
     *
     * @param reportId                车辆报告id
     * @param moduleId                检测模块id
     * @param dtCarResourcesTableName 分区表名
     * @return 影响行数
     */
    int batchDelete(int reportId, int moduleId, String dtCarResourcesTableName);

    /**
     * 根据report_id和module_id批量删除对应旧检测资源，并上传新数据
     *
     * @param list                    待插入数据
     * @param reportId                车辆报告id
     * @param moduleId                检测模块id
     * @param dtCarResourcesTableName 分区表名
     * @return 处理检测数据
     */
    PhpHonorResult handlerCarResourceList(List<CarResourcesEntity> list, int reportId, int moduleId, String dtCarResourcesTableName) throws Exception;

    /**
     * 返回车辆检测资源(dtCarResourcesTableName和reportId必填，其他选填)
     *
     * @param condition 查询条件对象
     * @return CarResourcesEntity
     */
    List<CarResourcesEntity> getCarResourceByQueryConditionObject(CarResourcesQueryCondition condition);
}
