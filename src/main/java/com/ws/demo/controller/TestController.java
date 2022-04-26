package com.ws.demo.controller;

import com.ws.demo.dto.CarResourcesConditionDTO;
import com.ws.demo.service.ICarReportService;
import com.ws.demo.service.ICarResourceService;
import com.ws.demo.service.impl.ChakeCarInfoService;
import com.ws.demo.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangsen
 * @description
 * @date 2022/4/26
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ChakeCarInfoService chakeCarInfoService;

    @Autowired
    private ICarReportService carReportService;
    @Autowired
    private ICarResourceService carResourceService;

    @RequestMapping("hello")
    @ResponseBody
    public String  getTest(){
        return "Hello World ,This is  Test";
    }

    @RequestMapping("report")
    @ResponseBody
    public String  getReport(){
        int reportId = 5524217;
//        return carReportService.getReportById(reportId).toString();
        return JsonUtils.toJsonStr(carReportService.getReportById(reportId));
    }
    @RequestMapping("carInfo")
    @ResponseBody
    public String  getCarInfo(){
        int carId = 3740;
//        return chakeCarInfoService.getCarDetailForReport3And5(carId).toString();
        return JsonUtils.toJsonStr(chakeCarInfoService.getCarDetailForReport3And5(carId));
    }

    @RequestMapping("carResource")
    @ResponseBody
    public String  getCarResource(){
        int reportId = 5524217;
        String saveTable = "car_resources_2022_04";
        CarResourcesConditionDTO conditionDTO = new CarResourcesConditionDTO();
        conditionDTO.setReportId(reportId);
        conditionDTO.setDtCarResourcesTableName(saveTable);
        return JsonUtils.toJsonStr(carResourceService.getCarResourceByCondition(conditionDTO,false));
    }
    @RequestMapping("carResourcePlus")
    @ResponseBody
    public String  getCarResourcePlus(){
        int reportId = 5524217;
        String saveTable = "car_resources_2022_04";
        CarResourcesConditionDTO conditionDTO = new CarResourcesConditionDTO();
        conditionDTO.setReportId(reportId);
        conditionDTO.setDtCarResourcesTableName(saveTable);
        return JsonUtils.toJsonStr(carResourceService.getCarResourceByCondition(conditionDTO,true));
    }
}