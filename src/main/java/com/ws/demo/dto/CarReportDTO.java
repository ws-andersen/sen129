package com.ws.demo.dto;

import java.util.Date;


/**
 * <p>
 * 报告信息表
 * </p>
 */
public class CarReportDTO {

    /**
     * 报告ID
     */
    private Integer reportId;


    /**
     * 车辆ID
     */
    private Integer carId;
    /**
     * 任务ID
     */
    private Integer taskId;
    /**
     * 检测师ID集合
     */
    private String testerIds;
    /**
     * 0 默认 1 大报告 2 小报告
     */
    private Integer reportType;
    /**
     * -1 删除,0 未发拍,1 拍卖中,2 拍卖结束(流拍),3 交易中,4 交易成功,5 交易失败,6 成交转至售后,20 已选择成交(拍卖成功）
     */
    private Integer auctionStatus;
    /**
     * 报告状态(0:未知 1:有效 2:检测中 3:失效)
     */
    private Integer status;
    /**
     * 音频类型(1:原声 2:生成声音 3:后转换原声 4:后转换生成声音)
     */
    private Integer audioType;
    /**
     * 音频状态(1:已上传 2:合成中 3:已合成)
     */
    private Integer audioStatus;

    /**
     * 合成瑕疵图状态(0:未合成 1:已合成)
     */
    private Integer defectStatus;
    /**
     * 是否有视频(1:无 2:有)
     */
    private Integer isVideo;

    /**
     * 视频状态(1:未开始合成 2:开始合成 30待转码 31转码中 32转码成功 33转码失败 100:合成完成)
     */
    private Integer videoStatus;


    /**
     * 视频处理方(0:七牛 1:腾讯 2:阿里 3;百度 4:查客 5:阿里yxp 6:wmedia)
     */
    private Integer videoHandleType;


    /**
     * 存储方(0:七牛 1:腾讯 2:阿里 3:百度 5:阿里yxp 6:wos 10：一汽丰田)
     */
    private Integer storageProvider;


    /**
     * 视频审核评分(-1:严重不合格 1:不合格 2:合格 3:优秀 4:精彩)
     */
    private Integer videoAuditStatus;


    /**
     * 资源表
     */
    private String saveTable;


    /**
     * 视频审核时间
     */
    private Date videoAuditTime;


    /**
     * 视频上传时间
     */
    private Date uploadTime;


    /**
     * 视频合成时间
     */
    private Date mergeTime;


    /**
     * 重新合成时间
     */
    private Date remergeTime;


    /**
     * 视频上架时间
     */
    private Date openVideoTime;


    /**
     * 视频下架时间
     */
    private Date closeVideoTime;


    /**
     * 清除视频(0:无,1:只保留高清)
     */
    private Integer isClearsVideo;


    /**
     * 失效状态(0:否,1:是)
     */
    private Integer isInvalid;


    /**
     * 失效时间
     */
    private Date invalidTime;


    /**
     * 检测评级 A,B,C,D
     */
    private String checkLevel;


    /**
     * 外观评分
     */
    private String appearanceScore;


    /**
     * 外观评分_测试
     */
    private String appearanceScoreTest;


    /**
     * 骨架评级
     */
    private String skeletonLevel;


    /**
     * 骨架评级_测试
     */
    private String skeletonLevelTest;


    /**
     * 是否涉水(B2C:水泡系数,B2B:1涉水,0未涉水)
     */
    private String isWading;


    /**
     * 是否涉水_测试
     */
    private String isWadingTest;


    /**
     * 内饰评级
     */
    private String interiorLevel;


    /**
     * 内饰评级_测试
     */
    private String interiorLevelTest;


    /**
     * C2B,B2C综合车况评级
     */
    private String conditionLevel;


    /**
     * c2b报告审核后报价
     */
    private String offerPrice;


    /**
     * 支付状态(0:无 1:未提交 2:审批中 3:审核通过 4:已付款 5:已驳回)
     */
    private Integer paymentStatus;


    /**
     * 重试次数
     */
    private Integer remergeCount;


    /**
     * 驳回人账号
     */
    private String exMastername;


    /**
     * 驳回人姓名
     */
    private String exFullname;


    /**
     * 驳回原因
     */
    private String exReason;


    /**
     * 驳回时间
     */
    private Date exReturnTime;


    /**
     * 版本号
     */
    private String reportVersion;


    /**
     * 钢7条驳回原因
     */
    private String reason;


    /**
     * 钢7条调用时间
     */
    private Date invokeTime;


    /**
     * 选品评级 0：默认 1：X 2：Y
     */
    private Integer quality;


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
    /**
     * 有无D柱 0无1有
     */
    private String isHbxn;
    /**
     * 是否过火
     */
    private String isOverLevel;


    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTesterIds() {
        return testerIds;
    }

    public void setTesterIds(String testerIds) {
        this.testerIds = testerIds;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Integer getAuctionStatus() {
        return auctionStatus;
    }

    public void setAuctionStatus(Integer auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAudioType() {
        return audioType;
    }

    public void setAudioType(Integer audioType) {
        this.audioType = audioType;
    }

    public Integer getAudioStatus() {
        return audioStatus;
    }

    public void setAudioStatus(Integer audioStatus) {
        this.audioStatus = audioStatus;
    }

    public Integer getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(Integer defectStatus) {
        this.defectStatus = defectStatus;
    }

    public Integer getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getVideoHandleType() {
        return videoHandleType;
    }

    public void setVideoHandleType(Integer videoHandleType) {
        this.videoHandleType = videoHandleType;
    }

    public Integer getStorageProvider() {
        return storageProvider;
    }

    public void setStorageProvider(Integer storageProvider) {
        this.storageProvider = storageProvider;
    }

    public Integer getVideoAuditStatus() {
        return videoAuditStatus;
    }

    public void setVideoAuditStatus(Integer videoAuditStatus) {
        this.videoAuditStatus = videoAuditStatus;
    }

    public String getSaveTable() {
        return saveTable;
    }

    public void setSaveTable(String saveTable) {
        this.saveTable = saveTable;
    }

    public Date getVideoAuditTime() {
        return videoAuditTime;
    }

    public void setVideoAuditTime(Date videoAuditTime) {
        this.videoAuditTime = videoAuditTime;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getMergeTime() {
        return mergeTime;
    }

    public void setMergeTime(Date mergeTime) {
        this.mergeTime = mergeTime;
    }

    public Date getRemergeTime() {
        return remergeTime;
    }

    public void setRemergeTime(Date remergeTime) {
        this.remergeTime = remergeTime;
    }

    public Date getOpenVideoTime() {
        return openVideoTime;
    }

    public void setOpenVideoTime(Date openVideoTime) {
        this.openVideoTime = openVideoTime;
    }

    public Date getCloseVideoTime() {
        return closeVideoTime;
    }

    public void setCloseVideoTime(Date closeVideoTime) {
        this.closeVideoTime = closeVideoTime;
    }

    public Integer getIsClearsVideo() {
        return isClearsVideo;
    }

    public void setIsClearsVideo(Integer isClearsVideo) {
        this.isClearsVideo = isClearsVideo;
    }

    public Integer getIsInvalid() {
        return isInvalid;
    }

    public void setIsInvalid(Integer isInvalid) {
        this.isInvalid = isInvalid;
    }

    public Date getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    public String getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
    }

    public String getAppearanceScore() {
        return appearanceScore;
    }

    public void setAppearanceScore(String appearanceScore) {
        this.appearanceScore = appearanceScore;
    }

    public String getAppearanceScoreTest() {
        return appearanceScoreTest;
    }

    public void setAppearanceScoreTest(String appearanceScoreTest) {
        this.appearanceScoreTest = appearanceScoreTest;
    }

    public String getSkeletonLevel() {
        return skeletonLevel;
    }

    public void setSkeletonLevel(String skeletonLevel) {
        this.skeletonLevel = skeletonLevel;
    }

    public String getSkeletonLevelTest() {
        return skeletonLevelTest;
    }

    public void setSkeletonLevelTest(String skeletonLevelTest) {
        this.skeletonLevelTest = skeletonLevelTest;
    }

    public String getIsWading() {
        return isWading;
    }

    public void setIsWading(String isWading) {
        this.isWading = isWading;
    }

    public String getIsWadingTest() {
        return isWadingTest;
    }

    public void setIsWadingTest(String isWadingTest) {
        this.isWadingTest = isWadingTest;
    }

    public String getInteriorLevel() {
        return interiorLevel;
    }

    public void setInteriorLevel(String interiorLevel) {
        this.interiorLevel = interiorLevel;
    }

    public String getInteriorLevelTest() {
        return interiorLevelTest;
    }

    public void setInteriorLevelTest(String interiorLevelTest) {
        this.interiorLevelTest = interiorLevelTest;
    }

    public String getConditionLevel() {
        return conditionLevel;
    }

    public void setConditionLevel(String conditionLevel) {
        this.conditionLevel = conditionLevel;
    }

    public String getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getRemergeCount() {
        return remergeCount;
    }

    public void setRemergeCount(Integer remergeCount) {
        this.remergeCount = remergeCount;
    }

    public String getExMastername() {
        return exMastername;
    }

    public void setExMastername(String exMastername) {
        this.exMastername = exMastername;
    }

    public String getExFullname() {
        return exFullname;
    }

    public void setExFullname(String exFullname) {
        this.exFullname = exFullname;
    }

    public String getExReason() {
        return exReason;
    }

    public void setExReason(String exReason) {
        this.exReason = exReason;
    }

    public Date getExReturnTime() {
        return exReturnTime;
    }

    public void setExReturnTime(Date exReturnTime) {
        this.exReturnTime = exReturnTime;
    }

    public String getReportVersion() {
        return reportVersion;
    }

    public void setReportVersion(String reportVersion) {
        this.reportVersion = reportVersion;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getInvokeTime() {
        return invokeTime;
    }

    public void setInvokeTime(Date invokeTime) {
        this.invokeTime = invokeTime;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
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

    public String getIsHbxn() {
        return isHbxn;
    }

    public void setIsHbxn(String isHbxn) {
        this.isHbxn = isHbxn;
    }

    public String getIsOverLevel() {
        return isOverLevel;
    }

    public void setIsOverLevel(String isOverLevel) {
        this.isOverLevel = isOverLevel;
    }

    @Override
    public String toString() {
        return "CarReportDTO{" +
                "reportId=" + reportId +
                ", carId=" + carId +
                ", taskId=" + taskId +
                ", testerIds='" + testerIds + '\'' +
                ", reportType=" + reportType +
                ", auctionStatus=" + auctionStatus +
                ", status=" + status +
                ", audioType=" + audioType +
                ", audioStatus=" + audioStatus +
                ", defectStatus=" + defectStatus +
                ", isVideo=" + isVideo +
                ", videoStatus=" + videoStatus +
                ", videoHandleType=" + videoHandleType +
                ", storageProvider=" + storageProvider +
                ", videoAuditStatus=" + videoAuditStatus +
                ", saveTable='" + saveTable + '\'' +
                ", videoAuditTime=" + videoAuditTime +
                ", uploadTime=" + uploadTime +
                ", mergeTime=" + mergeTime +
                ", remergeTime=" + remergeTime +
                ", openVideoTime=" + openVideoTime +
                ", closeVideoTime=" + closeVideoTime +
                ", isClearsVideo=" + isClearsVideo +
                ", isInvalid=" + isInvalid +
                ", invalidTime=" + invalidTime +
                ", checkLevel='" + checkLevel + '\'' +
                ", appearanceScore='" + appearanceScore + '\'' +
                ", appearanceScoreTest='" + appearanceScoreTest + '\'' +
                ", skeletonLevel='" + skeletonLevel + '\'' +
                ", skeletonLevelTest='" + skeletonLevelTest + '\'' +
                ", isWading='" + isWading + '\'' +
                ", isWadingTest='" + isWadingTest + '\'' +
                ", interiorLevel='" + interiorLevel + '\'' +
                ", interiorLevelTest='" + interiorLevelTest + '\'' +
                ", conditionLevel='" + conditionLevel + '\'' +
                ", offerPrice='" + offerPrice + '\'' +
                ", paymentStatus=" + paymentStatus +
                ", remergeCount=" + remergeCount +
                ", exMastername='" + exMastername + '\'' +
                ", exFullname='" + exFullname + '\'' +
                ", exReason='" + exReason + '\'' +
                ", exReturnTime=" + exReturnTime +
                ", reportVersion='" + reportVersion + '\'' +
                ", reason='" + reason + '\'' +
                ", invokeTime=" + invokeTime +
                ", quality=" + quality +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteTime=" + deleteTime +
                ", isHbxn='" + isHbxn + '\'' +
                ", isOverLevel='" + isOverLevel + '\'' +
                '}';
    }
}
