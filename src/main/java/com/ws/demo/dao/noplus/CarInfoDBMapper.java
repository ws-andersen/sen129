package com.ws.demo.dao.noplus;

import com.ws.demo.config.DataSource;
import com.ws.demo.constant.DBNameType;
import com.ws.demo.entity.CarInfoDO;
import org.apache.ibatis.annotations.Param;

public interface CarInfoDBMapper {
    /**
     * 获取车源基本信息
     * @param carId
     * @return CarInfo
     */
    @DataSource(DBNameType.dBNew)
    CarInfoDO getCarDetailForReport3And5(@Param("carId")Long carId);

    /**
     * 获取车源IsSmallReport字段
     * @param carId
     * @return IsSmallReport
     */
    @DataSource(DBNameType.dBNew)
    int getIsSmallReport(@Param("carId")Integer carId);

}
