package com.ws.demo.dto;


import java.util.List;

// 查询car_resource表条件对象
public class CarResourcesQueryCondition {
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
    /**
     * 类型
     */
    private List<String> itemDetailsAliasName;

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

    public List<String> getItemDetailsAliasName() {
        return itemDetailsAliasName;
    }

    public void setItemDetailsAliasName(List<String> itemDetailsAliasName) {
        this.itemDetailsAliasName = itemDetailsAliasName;
    }
}
