package com.ws.demo.service.impl;

import com.ws.demo.dao.noplus.CarInfoDBMapper;
import com.ws.demo.dto.CarInfoDTO;
import com.ws.demo.entity.CarInfoDO;
import com.ws.demo.util.WrapperBeanCopier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author wangsen
 * @description ChakeCarInfoDBMapper封装服务类
 * @date 2022/4/13
 */
@Service
public class ChakeCarInfoService {
    private static Logger logger = LoggerFactory.getLogger(ChakeCarInfoService.class);
    @Resource
    private CarInfoDBMapper carInfoDBMapper;

    public CarInfoDTO getCarDetailForReport3And5(long carId) {
        if (carId <= 0) {
            return null;
        }
        try {
            CarInfoDO carInfoDO = carInfoDBMapper.getCarDetailForReport3And5(carId);
            if (Objects.isNull(carInfoDO)) {
                logger.error("getCarDetailForReport3And5没有查询到结果,carId:{}", carId);
                return null;
            }
            CarInfoDTO carInfoDTO = new CarInfoDTO();
            WrapperBeanCopier.copyProperties(carInfoDO, carInfoDTO);
            return carInfoDTO;
        } catch (Exception e) {
            logger.error("getCarDetailForReport3And5异常,carId:{},异常:", carId, e);
        }
        return null;
    }

    public int getIsSmallReport(int carId) {
        if (carId <= 0) {
            return 0;
        }
        try {
            return carInfoDBMapper.getIsSmallReport(carId);
        } catch (Exception e) {
            logger.error("getIsSmallReport异常,carId:{},异常:", carId, e);
        }
        return 0;
    }
}
