package com.ws.demo.service;

import com.ws.demo.dto.CarReportDTO;

import java.util.List;

/**
 * <p>
 * 报告信息表 服务类
 * </p>
 *
 * @author z.l <zhanglei87@58.com>
 * @since 2020-12-24
 */
public interface ICarReportService {

    String URL = "tcp://chake/CarReportServiceImpl";

    /**
     * 根据报告ID返回报告
     *
     * @param report_id 报告ID
     * @return CarReportDTO
     */
    CarReportDTO getReportById(Integer report_id);

    /**
     * 列表报告信息
     *
     * @param report_id 报告ID
     * @return List<CarReportDTO>
     */
    List<CarReportDTO> getReportList(List<Integer> report_id);

    /**
     * 根据task_id返回报告
     *
     * @param taskId 任务id
     * @return CarReportDTO
     */
    CarReportDTO getReportByTaskId(Integer taskId);
}
