package com.ws.demo.dto;


import java.util.List;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author pansiheng
 * @since 2020-12-25
 */
public class CarResourcesConditionDTO {


    /**
     * 分表字段、必传
     * 资源表分表表名
     */
    private String  dtCarResourcesTableName;


    /**
     * 报告id
     */
    private Integer reportId;

    /**
     * 类型
     */
    private List<Integer> types;
    /**
     * 任务id
     */
    private Integer taskId;

    public String getDtCarResourcesTableName() {
        return dtCarResourcesTableName;
    }

    public void setDtCarResourcesTableName(String dtCarResourcesTableName) {
        this.dtCarResourcesTableName = dtCarResourcesTableName;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
