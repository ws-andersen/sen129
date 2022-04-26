package com.ws.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author pansiheng
 * @since 2020-12-25
 */
@TableName("mp_dt_car_resources")
public class CarResourcesEntity {



    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /**
     * 资源类型(0:异常 1:正常: 2:常规照片 3:瑕疵原图 4:瑕疵图 5:分段视频 6:完整视频 7:文字 8:瑕疵关联 9:车辆原图 10:处理后车辆图 11:极速 12:标清 13:高清 14:证件图 15:视频字幕 16:车辆信息 17:综合评级 18:处理后证件图 19:水印视频 20:字幕 21:合成瑕疵图 22:缺少合成信息 24:车辆检测 25:熔断检测 26:视频检测 27:GPS报告  28:GPS视频 29:检测项总备注 30:漆膜仪数值 31:到店打点图 51:视频tags 55:无此结构 56:GPS物流数据 57:评级详情,58:复核备注,59:底盘检测_行驶里程,60:机电配置)
     */
    private Integer type;


    /**
     * 资源详情
     */
    private String sourceContent;


    /**
     * 补充说明(type=5,6时为时长)
     */
    private String explains;


    /**
     * 任务id
     */
    private Integer taskId;


    /**
     * 车辆id
     */
    private Integer carId;


    /**
     * 报告ID
     */
    private Integer reportId;


    /**
     * 检测师id
     */
    private Integer testerId;


    /**
     * 检测师名称
     */
    private String testerName;


    /**
     * 一级检测项ID
     */
    private Integer moduleId;


    /**
     * 二级检测项ID
     */
    private Integer itemId;


    /**
     * 二级检测别名
     */
    private String moduleItemsAliasName;


    /**
     * 三级检测项ID
     */
    private Integer detailId;


    /**
     * 三级检测别名
     */
    private String itemDetailsAliasName;


    /**
     * 资源ID
     */
    private String sourceId;


    /**
     * 资源hash
     */
    private String sourceHash;


    /**
     * 类型详细说明(type9:视频规格 type11-13:视频时长|大小)
     */
    private String ext;


    /**
     * 排序
     */
    private Integer sort;


    /**
     * 属性标记
     */
    private String label;


    /**
     * 状态(1:正常 2:删除 3:检测模块记录有效数据)
     */
    private Integer status;


    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 更新时间
     */
    private Date updateTime;


    /**
     * 删除时间
     */
    private Date deleteTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSourceContent() {
        return sourceContent;
    }

    public void setSourceContent(String sourceContent) {
        this.sourceContent = sourceContent;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getTesterId() {
        return testerId;
    }

    public void setTesterId(Integer testerId) {
        this.testerId = testerId;
    }

    public String getTesterName() {
        return testerName;
    }

    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getModuleItemsAliasName() {
        return moduleItemsAliasName;
    }

    public void setModuleItemsAliasName(String moduleItemsAliasName) {
        this.moduleItemsAliasName = moduleItemsAliasName;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getItemDetailsAliasName() {
        return itemDetailsAliasName;
    }

    public void setItemDetailsAliasName(String itemDetailsAliasName) {
        this.itemDetailsAliasName = itemDetailsAliasName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceHash() {
        return sourceHash;
    }

    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
