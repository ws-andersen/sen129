package com.ws.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ws.demo.dao.CarReportMapper;
import com.ws.demo.dto.CarReportDTO;
import com.ws.demo.entity.CarReportEntity;
import com.ws.demo.service.ICarReportService;
import com.ws.demo.util.WrapperBeanCopier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 报告信息表 服务实现类
 * </p>
 *
 * @since 2020-12-24
 */
@Service
public class CarReportServiceImpl implements ICarReportService {

    @Autowired
    private CarReportMapper carReportMapper;

    /**
     * 报告信息
     *
     * @param report_id 报告ID
     * @return
     */
    @Override
//    @RedisCache(cachePrefix = "newChake:", expire = 600, randomExpireRange = 600)
    public CarReportDTO getReportById(Integer report_id) {
        if (report_id == null) {
            return null;
        }
        CarReportDTO carReportDTO = null;
        long start = System.currentTimeMillis();
        try {
            CarReportEntity carReportEntity = carReportMapper.selectById(report_id);
            carReportDTO = WrapperBeanCopier.copyProperties(carReportEntity, CarReportDTO.class);
        } catch (Exception exception) {
//            log.error("根据id查询报告信息异常,report_id:{}", report_id, exception);
        }
//        log.info("根据id查询报告信息getReportById耗时:{}ms,report_id:{}", System.currentTimeMillis() - start, report_id);
        return carReportDTO;
    }

    /**
     * 报告列表
     *
     * @param report_id 报告ID
     * @return
     */
    @Override
    public List<CarReportDTO> getReportList(List<Integer> report_id) {
        try {
            List<CarReportEntity> carReportEntities = carReportMapper.selectBatchIds(report_id);
            List<CarReportDTO> carReportDTOS = WrapperBeanCopier.copyPropertiesOfList(carReportEntities, CarReportDTO.class);

            return null != carReportDTOS ? carReportDTOS : Collections.EMPTY_LIST;

        } catch (Exception exception) {
//            log.error("根据id查询报告列表信息异常,report_id:{}", JsonUtils.tryGetJsonLog(report_id), exception);
        }

        return Collections.EMPTY_LIST;
    }

    @Override
    public CarReportDTO getReportByTaskId(Integer taskId) {
        if (Objects.isNull(taskId)) {
            return null;
        }
        CarReportDTO carReportDTO = null;
        long start = System.currentTimeMillis();
        try {
            LambdaQueryWrapper<CarReportEntity> queryWrapper = Wrappers.lambdaQuery();
            queryWrapper.eq(CarReportEntity::getTaskId, taskId);
            CarReportEntity carReportEntity = carReportMapper.selectOne(queryWrapper);
            carReportDTO = WrapperBeanCopier.copyProperties(carReportEntity, CarReportDTO.class);
        } catch (Exception exception) {
//            log.error("根据id查询报告信息异常,taskId:{}", taskId, exception);
        }
//        log.info("根据taskId查询报告信息getReportByTaskId耗时:{}ms,taskId:{}", System.currentTimeMillis() - start, taskId);
        return carReportDTO;
    }
}
