package com.ws.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ws.demo.config.DataSource;
import com.ws.demo.config.DataSourceConfig;
import com.ws.demo.constant.DBNameType;
import com.ws.demo.dao.fenbiao.CarResourcesMapper;
import com.ws.demo.dto.CarResourcesConditionDTO;
import com.ws.demo.dto.CarResourcesQueryCondition;
import com.ws.demo.dto.base.PhpHonorResult;
import com.ws.demo.entity.CarResourcesEntity;
import com.ws.demo.service.ICarResourceService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * Created by z.l on 2021/03/31.
 */
@Service
public class CarResourceServiceImpl implements ICarResourceService {
    private static final Logger log = LoggerFactory.getLogger(CarResourceServiceImpl.class);
    @Resource
    private CarResourcesMapper carResourcesMapper;

    /**
     * 查询车源相关检查信息
     *
     * @return
     */
    @Override
    public List<CarResourcesEntity> getCarResourceByCondition(CarResourcesConditionDTO carResourcesConditionDTO, boolean isPlus) {

        try {
            return getCarResources(carResourcesConditionDTO, isPlus);
        } catch (Exception e) {
            String msg = "根据报告id查询车辆信息异常 reportId:" + carResourcesConditionDTO.getReportId();
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

    /**
     * mybatis-plus / xml 可以配合使用，分表查询时对表名进行动态替换
     */
    private List<CarResourcesEntity> getCarResources(CarResourcesConditionDTO carResourcesConditionDTO, boolean isPlus) {

        if (isPlus) {
            // mybatis-plus
            DataSourceConfig.curTableName.set(carResourcesConditionDTO.getDtCarResourcesTableName());
            LambdaQueryWrapper<CarResourcesEntity> objectLambdaQueryWrapper = Wrappers.lambdaQuery();
            objectLambdaQueryWrapper.eq(CarResourcesEntity::getStatus, 1)
                    .eq(CarResourcesEntity::getReportId, carResourcesConditionDTO.getReportId());
            List<CarResourcesEntity> carResourcesEntityList;
            carResourcesEntityList = carResourcesMapper.selectList(objectLambdaQueryWrapper);
            log.info("查询车资源表carResources" + "表名：" + carResourcesConditionDTO.getDtCarResourcesTableName() + "ReportId" + carResourcesConditionDTO.getReportId());
            return carResourcesEntityList;
        } else {
            // xml
            DataSourceConfig.curTableName.set(carResourcesConditionDTO.getDtCarResourcesTableName());
            return carResourcesMapper.selectCarResources(carResourcesConditionDTO.getReportId());
        }
    }

    @Override
    public int batchInsert(List<CarResourcesEntity> list, String dtCarResourcesTableName) {
        try {
            if (CollectionUtils.isEmpty(list) || StringUtils.isBlank(dtCarResourcesTableName)) {
                log.error("检测资源数据批量插入参数不合法,list是否是空的:{},dtCarResourcesTableName:{}", CollectionUtils.isEmpty(list), dtCarResourcesTableName);
                return 0;
            }
            DataSourceConfig.curTableName.set(dtCarResourcesTableName);
            // xml的方法
            int result = carResourcesMapper.batchInsert(list);
            log.info("检测资源数据批量插入结果result:{},list.size:{},dtCarResourcesTableName:{}", result, list.size(), dtCarResourcesTableName);
            return result;
        } catch (Exception e) {
            log.error("批量插入车辆检测数据信息列表发生了异常,dtCarResourcesTableName:{},异常:", dtCarResourcesTableName, e);
        }
        return -1;
    }

    @Override
    public int batchDelete(int reportId, int moduleId, String dtCarResourcesTableName) {
        try {
            if (reportId <= 0 || moduleId <= 0 || StringUtils.isBlank(dtCarResourcesTableName)) {
                log.error("检测资源数据批量删除参数不合法,reportId:{},moduleId:{},dtCarResourcesTableName:{}", reportId, moduleId, dtCarResourcesTableName);
                return -1;
            }
            DataSourceConfig.curTableName.set(dtCarResourcesTableName);
            int result = carResourcesMapper.batchDelete(reportId, moduleId);
            log.info("检测资源数据批量删除结果result:{},reportId:{},moduleId:{},dtCarResourcesTableName:{}", result, reportId, moduleId, dtCarResourcesTableName);
            return result;
        } catch (Exception e) {
            log.error("批量删除车辆检测数据信息列表发生了异常,reportId:{},moduleId:{},dtCarResourcesTableName:{},异常:", reportId, moduleId, dtCarResourcesTableName, e);
        }
        return -2;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 5)
    @DataSource(DBNameType.chake)
    public PhpHonorResult handlerCarResourceList(List<CarResourcesEntity> list, int reportId, int moduleId, String dtCarResourcesTableName) throws Exception {
        log.info("开始处理车辆检测数据数据,reportId:{},moduleId:{}", reportId, moduleId);
        if (CollectionUtils.isEmpty(list) || reportId <= 0
                || moduleId <= 0 || StringUtils.isBlank(dtCarResourcesTableName)) {
            log.error("处理车辆检测数据数据参数有误,reportId:{},moduleId:{},dtCarResourcesTableName:{}", reportId, moduleId, dtCarResourcesTableName);
            return PhpHonorResult.fail(-101, "检测数据参数有误");
        }
        // 处理历史数据
        int historyHandlerResult = batchDelete(reportId, moduleId, dtCarResourcesTableName);
        if (historyHandlerResult < 0) {
            log.error("删除车辆历史检测数据数据失败，准备回滚,reportId:{},moduleId:{},dtCarResourcesTableName:{}", reportId, moduleId, dtCarResourcesTableName);
            throw new Exception("历史检测数据删除失败");
        }

        // 插入新数据
        int insertResult = batchInsert(list, dtCarResourcesTableName);
        int expectSize = list.size();
        if (insertResult != expectSize) {
            log.error("插入车源新检测数据失败,准备回滚,list:{},dtCarResourcesTableName:{}", list, dtCarResourcesTableName);
            throw new Exception("新检测数据插入失败");
        }
        return PhpHonorResult.success();
    }

    @Override
    public List<CarResourcesEntity> getCarResourceByQueryConditionObject(CarResourcesQueryCondition condition) {
        if (Objects.isNull(condition) || Objects.isNull(condition.getDtCarResourcesTableName())
                || Objects.isNull(condition.getReportId())) {
            log.error("getCarResourceByQueryConditionObject入参必填项有误,condition:{}", condition);
            return null;
        }
        try {
            DataSourceConfig.curTableName.set(condition.getDtCarResourcesTableName());
            LambdaQueryWrapper<CarResourcesEntity> objectLambdaQueryWrapper = Wrappers.lambdaQuery();
            objectLambdaQueryWrapper.eq(CarResourcesEntity::getReportId, condition.getReportId()).eq(CarResourcesEntity::getStatus, 1);
            if (!CollectionUtils.isEmpty(condition.getTypes())) {
                objectLambdaQueryWrapper.in(CarResourcesEntity::getType, condition.getTypes());
            }
            if (!CollectionUtils.isEmpty(condition.getItemDetailsAliasName())) {
                objectLambdaQueryWrapper.in(CarResourcesEntity::getItemDetailsAliasName, condition.getItemDetailsAliasName());
            }

            return carResourcesMapper.selectList(objectLambdaQueryWrapper);
        } catch (Exception e) {
            log.error("getCarResourceByQueryConditionObject查询car_resource表数据异常,入参:{},异常:", condition, e);
        }
        return null;
    }

    /**
     * 获取注册日期（注册日期=上牌日期）
     *
     * @param reportId
     * @return
     */
    public List<CarResourcesEntity> getRegisterDate(Integer reportId, String tableName) {
        try {
            DataSourceConfig.curTableName.set(tableName);
            LambdaQueryWrapper<CarResourcesEntity> objectLambdaQueryWrapper = Wrappers.lambdaQuery();
            objectLambdaQueryWrapper.eq(CarResourcesEntity::getReportId, reportId).eq(CarResourcesEntity::getStatus, 1)
                    .like(CarResourcesEntity::getExplains, "%date%");
            List<CarResourcesEntity> carResourcesEntityList;
            if (reportId != null) {
                carResourcesEntityList = carResourcesMapper.selectList(objectLambdaQueryWrapper);
                return carResourcesEntityList;
            } else {
                log.info("根据报告id获取注册日期异常" + reportId);
                return null;
            }
        } catch (Exception e) {
            String msg = "根据报告id获取注册日期异常 reportId:" + reportId;
            log.error(msg, e);
            throw new RuntimeException(msg);
        }
    }

}
