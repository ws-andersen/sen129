package com.ws.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * CarInfo
 * @author zerocoder
 * @since 2021-02-19
 */
public class CarInfoDTO {
    private Long CarID;
    private Long TaskId;
    private Integer Bodywork;

    private String EngineNo;

    private String vin;

    private Date RegisterDate;
    /**
     * 车辆出厂日期
     */
    private Date LicenseYear;
    private String CarFullName;

    private Integer CarBasicId;

    private Integer SerieId;

    private Integer ProducerId;

    private Integer BranId;

    /**
     * 变速类型
     */
    private Integer Transmission;

    /**
     * 排气量
     */
    private BigDecimal Exhaust;

    /**
     * 车辆类型
     */
    private Integer CarUseType;

    /**
     * 原始购车价
     */
    private BigDecimal OrginalPrice;

    /**
     * 强制险到期日
     */
    private Date FoAssuranceDate;

    /**
     * 是否有维修保养记录
     */
    private Integer IsHaveAssuranceRecord;

    /**
     * 车辆配置
     */
    private String CarConfigInfo;

    /**
     * 表显里程数
     */
    private Integer Mileage;

    /**
     * 环保标准
     */
    private String IsEffluentYellow;

    /**
     * 环保标/年检标
     */
    private String AnnualDetection;

    /**
     * 车身颜色
     */
    private String CarBodyColor;

    /**
     * 其他配置
     */
    private String CarOtherConfigInfo;

    private Integer LicensProvince;

    private Integer LicensCity;

    /**
     * 是否一手车
     */
    private Integer IsNew;

    /**
     * 过户日期
     */
    private Date TransferDate;

    /**
     * 是否有保养记录
     */
    private Integer IsHaveMainTenance;

    /**
     * 购置税
     */
    private Integer IsHavePurchaseTax;

    /**
     * 车船税到期日期
     */
    private Date CarShipTaxExpireYear;

    /**
     * 年审到期日期
     */
    private Date DetectionYear;

    /**
     * 是否有交强险 第三者保险
     */
    private Integer IsHaveFoAssurance;

    /**
     * 交强险到期日期
     */
    private Date FoAssuranceDateYear;

    /**
     * 是否有商业险
     */
    private Integer IsHaveComAssurance;

    /**
     * 商业险到期日期
     */
    private Date IsHaveComAssuranceYear;

    /**
     * 商业险金额
     */
    private String ComAssuranceMoney;

    /**
     * 车牌号码
     */
    private String LicenseCar;

    /**
     * 发动机号码是否完整
     */
    private Integer IsCompleteEngineNumber;

    /**
     * 发动机号码是否变更
     */
    private Integer IsChangeEngineNumber;

    private String CarModel;

    /**
     * 是否详细检测
     */
    private Integer IsInDetail;
    private String Explain;
    private String DetectOuterInfo;
    private String DetectInnerInfo;
    private String DetectSkeletonInfo;
    private String OuterSheetMetal;
    private String SkeletonSheetMetal;
    private Integer Owner;
    /**
     * 行驶本 0 有 1 丢失
     */
    private Integer DrivingCertification;
    /**
     * 登记证
     */
    private Integer Registration;
    /**
     * 原始购车发票 0 有 1 丢失 2 有发票未验证
     */
    private Integer BuyingReceipt;
    /**
     * 过户发票 0 有 1 丢失
     */
    private Integer TransferInvoice;
    /**
     * 过户次数
     */
    private Integer TransferCount;
    /**
     * 说明书 0 有 1丢失 
     */
    private Integer ExplainBook;
    /**
     * 车钥匙数量
     */
    private Integer CarKeys;
    /**
     * 最后保养公里数
     */
    private Integer MaintenanceKM;
    /**
     * 车辆牌证状态 0 齐全 1 丢失
     */
    private Integer LicenseCarStatue;
    /**
     * 车身原色
     */
    private String CarOriginalColor;
    /**
     * 燃油类型
     */
    private Integer FuelType;
    /**
     * 公告号码
     */
    private String NoticeNumber;
    /**
     * 是否改装
     */
    private Integer IsRefit;
    /**
     * 改装说明
     */
    private String RefitContent;
    /**
     * 座椅整体描述
     */
    private String ChairContent;
    /**
     * 市区编号
     */
    private Integer CityAreaId;
    /**
     * 安全气囊描述
     */
    private String GasbagContent;
    private Integer IsHaveCarShiptax;
    /**
     * 是否带牌销售
     */
    private Integer ExchangeWithLicense;
    /**
     * 是否上牌
     */
    private Integer IsHaveCard;
    private String CarBody;
    private Integer PracticalMileage;
    private Integer NewCarWarranty;
    private Boolean IsButlerService;
    private String ConditionGrade;
    private String DynamicDetection;
    private String ParkingNumber;
    private String OuterPic;
    private String InnerPic;
    private String SkeletonPic;
    private String OuterImplicitPic;
    private String SkeletonImplicitPic;
    private Integer transferType;
    private BigDecimal Fee;
    private BigDecimal dealerPrice;
    private String lawLessBlame;
    private String modifiedVestingParty;
    private String formalitiesGet;
    private String formalitiesLost;
    private String formalitiesTransaction;
    private String formalitiesRetroactive;
    private Integer xcpCarId;
    private String priceUser;
    private String priceUserMoblie;
    private Integer transferMarketid;
    private Integer publishTvuid;
    private BigDecimal purchasePrice;
    private Integer CarType;
    private Integer CarLocation;
    private String ArrangeItemStr;
    private Integer IsChangeFee;
    private String ConditionGradeSmall;
    private Integer UniqueId;
    private String UniqueSerial;
    private Date ScrapDate;
    private Integer SelfInsurance;
    /**
     * 年检
     */
    private Date AnnualValidity;
    private String DeviceModel;
    private Integer ProxyTvaID;
    private String ChakeVersion;
    private Integer SourceFrom;
    private Integer IsBubbleCar;
    private Integer ClientId;
    private String MobileDeviceOS;
    private Double ProxyFee;
    private String CarConfigKey;
    private Integer Papers;
    private Integer PeccancyDays;
    private Integer PeccancyScore;
    private Integer PeccancyYuan;
    private Integer wtVIN;
    private Integer wtLicenseCar;
    private Integer wtEngineNo;
    private Integer JQSelfInsurance;
    private Integer IsSmallReport;
    private Integer IsAnnualValidity;
    private String AppearancePaint;
    private String SkeletonPaint;
    private Integer Eid;
    private Double dealerPriceTotal;
    private Integer isLedger;
    private String RedbookName;
    private String SuperiorName;
    private Integer CertificateCard;
    private Integer FactoryCode;
    private Integer NewCarPhoto;
    private Integer TheNewCar;
    private Integer MaintainManual;
    private Integer EnvironmentalID;
    private Integer toVINCarModel;
    private String toCarModel;
    private String MaintenanceID;
    /**
     * 0 非U2车 1 U2车（不发拍）2 U2车（发拍）
     */
    private Integer U2Status;
    /**
     * 复核状态 1-正常，0-异常
     */
    private Integer RecheckStatus;
    /**
     * 复核异常的说明
     */
    private String RecheckExplain;
    /**
     * 复制报告用途 空-无 0-处置 1-
     */
    private Integer SourceTo;
    private String YxpXdrAccout;
    private String YxpXdrName;
    private Integer IsBubbleCarAuto;
    private String ConditionGradeAuto;
    private Integer ConditionScoreAuto;
    private String TeShuYongTu;
    private Date rowVersion;
    /**
     * 图片存储，0：优信；1：58
     */
    private Integer PicServerType;
    /**
     * 车辆来源 0：其他，1：打包车，2：一丰车
     */
    private Integer SourceType;
    private String checkLevel;
    private String checkLevelDesc;
    public Long getCarID() {
        return CarID;
    }

    public void setCarID(Long carID) {
        CarID = carID;
    }

    public Long getTaskId() {
        return TaskId;
    }

    public void setTaskId(Long taskId) {
        TaskId = taskId;
    }

    public Integer getBodywork() {
        return Bodywork;
    }

    public void setBodywork(Integer bodywork) {
        Bodywork = bodywork;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public void setEngineNo(String engineNo) {
        EngineNo = engineNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public Date getLicenseYear() {
        return LicenseYear;
    }

    public void setLicenseYear(Date licenseYear) {
        LicenseYear = licenseYear;
    }

    public String getCarFullName() {
        return CarFullName;
    }

    public void setCarFullName(String carFullName) {
        CarFullName = carFullName;
    }

    public Integer getCarBasicId() {
        return CarBasicId;
    }

    public void setCarBasicId(Integer carBasicId) {
        CarBasicId = carBasicId;
    }

    public Integer getSerieId() {
        return SerieId;
    }

    public void setSerieId(Integer serieId) {
        SerieId = serieId;
    }

    public Integer getProducerId() {
        return ProducerId;
    }

    public void setProducerId(Integer producerId) {
        ProducerId = producerId;
    }

    public Integer getBranId() {
        return BranId;
    }

    public void setBranId(Integer branId) {
        BranId = branId;
    }

    public Integer getTransmission() {
        return Transmission;
    }

    public void setTransmission(Integer transmission) {
        Transmission = transmission;
    }

    public BigDecimal getExhaust() {
        return Exhaust;
    }

    public void setExhaust(BigDecimal exhaust) {
        Exhaust = exhaust;
    }

    public Integer getCarUseType() {
        return CarUseType;
    }

    public void setCarUseType(Integer carUseType) {
        CarUseType = carUseType;
    }

    public BigDecimal getOrginalPrice() {
        return OrginalPrice;
    }

    public void setOrginalPrice(BigDecimal orginalPrice) {
        OrginalPrice = orginalPrice;
    }

    public Date getFoAssuranceDate() {
        return FoAssuranceDate;
    }

    public void setFoAssuranceDate(Date foAssuranceDate) {
        FoAssuranceDate = foAssuranceDate;
    }

    public Integer getIsHaveAssuranceRecord() {
        return IsHaveAssuranceRecord;
    }

    public void setIsHaveAssuranceRecord(Integer isHaveAssuranceRecord) {
        IsHaveAssuranceRecord = isHaveAssuranceRecord;
    }

    public String getCarConfigInfo() {
        return CarConfigInfo;
    }

    public void setCarConfigInfo(String carConfigInfo) {
        CarConfigInfo = carConfigInfo;
    }

    public Integer getMileage() {
        return Mileage;
    }

    public void setMileage(Integer mileage) {
        Mileage = mileage;
    }

    public String getIsEffluentYellow() {
        return IsEffluentYellow;
    }

    public void setIsEffluentYellow(String isEffluentYellow) {
        IsEffluentYellow = isEffluentYellow;
    }

    public String getAnnualDetection() {
        return AnnualDetection;
    }

    public void setAnnualDetection(String annualDetection) {
        AnnualDetection = annualDetection;
    }

    public String getCarBodyColor() {
        return CarBodyColor;
    }

    public void setCarBodyColor(String carBodyColor) {
        CarBodyColor = carBodyColor;
    }

    public String getCarOtherConfigInfo() {
        return CarOtherConfigInfo;
    }

    public void setCarOtherConfigInfo(String carOtherConfigInfo) {
        CarOtherConfigInfo = carOtherConfigInfo;
    }

    public Integer getLicensProvince() {
        return LicensProvince;
    }

    public void setLicensProvince(Integer licensProvince) {
        LicensProvince = licensProvince;
    }

    public Integer getLicensCity() {
        return LicensCity;
    }

    public void setLicensCity(Integer licensCity) {
        LicensCity = licensCity;
    }

    public Integer getIsNew() {
        return IsNew;
    }

    public void setIsNew(Integer isNew) {
        IsNew = isNew;
    }

    public Date getTransferDate() {
        return TransferDate;
    }

    public void setTransferDate(Date transferDate) {
        TransferDate = transferDate;
    }

    public Integer getIsHaveMainTenance() {
        return IsHaveMainTenance;
    }

    public void setIsHaveMainTenance(Integer isHaveMainTenance) {
        IsHaveMainTenance = isHaveMainTenance;
    }

    public Integer getIsHavePurchaseTax() {
        return IsHavePurchaseTax;
    }

    public void setIsHavePurchaseTax(Integer isHavePurchaseTax) {
        IsHavePurchaseTax = isHavePurchaseTax;
    }

    public Date getCarShipTaxExpireYear() {
        return CarShipTaxExpireYear;
    }

    public void setCarShipTaxExpireYear(Date carShipTaxExpireYear) {
        CarShipTaxExpireYear = carShipTaxExpireYear;
    }

    public Date getDetectionYear() {
        return DetectionYear;
    }

    public void setDetectionYear(Date detectionYear) {
        DetectionYear = detectionYear;
    }

    public Integer getIsHaveFoAssurance() {
        return IsHaveFoAssurance;
    }

    public void setIsHaveFoAssurance(Integer isHaveFoAssurance) {
        IsHaveFoAssurance = isHaveFoAssurance;
    }

    public Date getFoAssuranceDateYear() {
        return FoAssuranceDateYear;
    }

    public void setFoAssuranceDateYear(Date foAssuranceDateYear) {
        FoAssuranceDateYear = foAssuranceDateYear;
    }

    public Integer getIsHaveComAssurance() {
        return IsHaveComAssurance;
    }

    public void setIsHaveComAssurance(Integer isHaveComAssurance) {
        IsHaveComAssurance = isHaveComAssurance;
    }

    public Date getIsHaveComAssuranceYear() {
        return IsHaveComAssuranceYear;
    }

    public void setIsHaveComAssuranceYear(Date isHaveComAssuranceYear) {
        IsHaveComAssuranceYear = isHaveComAssuranceYear;
    }

    public String getComAssuranceMoney() {
        return ComAssuranceMoney;
    }

    public void setComAssuranceMoney(String comAssuranceMoney) {
        ComAssuranceMoney = comAssuranceMoney;
    }

    public String getLicenseCar() {
        return LicenseCar;
    }

    public void setLicenseCar(String licenseCar) {
        LicenseCar = licenseCar;
    }

    public Integer getIsCompleteEngineNumber() {
        return IsCompleteEngineNumber;
    }

    public void setIsCompleteEngineNumber(Integer isCompleteEngineNumber) {
        IsCompleteEngineNumber = isCompleteEngineNumber;
    }

    public Integer getIsChangeEngineNumber() {
        return IsChangeEngineNumber;
    }

    public void setIsChangeEngineNumber(Integer isChangeEngineNumber) {
        IsChangeEngineNumber = isChangeEngineNumber;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public Integer getIsInDetail() {
        return IsInDetail;
    }

    public void setIsInDetail(Integer isInDetail) {
        IsInDetail = isInDetail;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public String getDetectOuterInfo() {
        return DetectOuterInfo;
    }

    public void setDetectOuterInfo(String detectOuterInfo) {
        DetectOuterInfo = detectOuterInfo;
    }

    public String getDetectInnerInfo() {
        return DetectInnerInfo;
    }

    public void setDetectInnerInfo(String detectInnerInfo) {
        DetectInnerInfo = detectInnerInfo;
    }

    public String getDetectSkeletonInfo() {
        return DetectSkeletonInfo;
    }

    public void setDetectSkeletonInfo(String detectSkeletonInfo) {
        DetectSkeletonInfo = detectSkeletonInfo;
    }

    public String getOuterSheetMetal() {
        return OuterSheetMetal;
    }

    public void setOuterSheetMetal(String outerSheetMetal) {
        OuterSheetMetal = outerSheetMetal;
    }

    public String getSkeletonSheetMetal() {
        return SkeletonSheetMetal;
    }

    public void setSkeletonSheetMetal(String skeletonSheetMetal) {
        SkeletonSheetMetal = skeletonSheetMetal;
    }

    public Integer getOwner() {
        return Owner;
    }

    public void setOwner(Integer owner) {
        Owner = owner;
    }

    public Integer getDrivingCertification() {
        return DrivingCertification;
    }

    public void setDrivingCertification(Integer drivingCertification) {
        DrivingCertification = drivingCertification;
    }

    public Integer getRegistration() {
        return Registration;
    }

    public void setRegistration(Integer registration) {
        Registration = registration;
    }

    public Integer getBuyingReceipt() {
        return BuyingReceipt;
    }

    public void setBuyingReceipt(Integer buyingReceipt) {
        BuyingReceipt = buyingReceipt;
    }

    public Integer getTransferInvoice() {
        return TransferInvoice;
    }

    public void setTransferInvoice(Integer transferInvoice) {
        TransferInvoice = transferInvoice;
    }

    public Integer getTransferCount() {
        return TransferCount;
    }

    public void setTransferCount(Integer transferCount) {
        TransferCount = transferCount;
    }

    public Integer getExplainBook() {
        return ExplainBook;
    }

    public void setExplainBook(Integer explainBook) {
        ExplainBook = explainBook;
    }

    public Integer getCarKeys() {
        return CarKeys;
    }

    public void setCarKeys(Integer carKeys) {
        CarKeys = carKeys;
    }

    public Integer getMaintenanceKM() {
        return MaintenanceKM;
    }

    public void setMaintenanceKM(Integer maintenanceKM) {
        MaintenanceKM = maintenanceKM;
    }

    public Integer getLicenseCarStatue() {
        return LicenseCarStatue;
    }

    public void setLicenseCarStatue(Integer licenseCarStatue) {
        LicenseCarStatue = licenseCarStatue;
    }

    public String getCarOriginalColor() {
        return CarOriginalColor;
    }

    public void setCarOriginalColor(String carOriginalColor) {
        CarOriginalColor = carOriginalColor;
    }

    public Integer getFuelType() {
        return FuelType;
    }

    public void setFuelType(Integer fuelType) {
        FuelType = fuelType;
    }

    public String getNoticeNumber() {
        return NoticeNumber;
    }

    public void setNoticeNumber(String noticeNumber) {
        NoticeNumber = noticeNumber;
    }

    public Integer getIsRefit() {
        return IsRefit;
    }

    public void setIsRefit(Integer isRefit) {
        IsRefit = isRefit;
    }

    public String getRefitContent() {
        return RefitContent;
    }

    public void setRefitContent(String refitContent) {
        RefitContent = refitContent;
    }

    public String getChairContent() {
        return ChairContent;
    }

    public void setChairContent(String chairContent) {
        ChairContent = chairContent;
    }

    public Integer getCityAreaId() {
        return CityAreaId;
    }

    public void setCityAreaId(Integer cityAreaId) {
        CityAreaId = cityAreaId;
    }

    public String getGasbagContent() {
        return GasbagContent;
    }

    public void setGasbagContent(String gasbagContent) {
        GasbagContent = gasbagContent;
    }

    public Integer getIsHaveCarShiptax() {
        return IsHaveCarShiptax;
    }

    public void setIsHaveCarShiptax(Integer isHaveCarShiptax) {
        IsHaveCarShiptax = isHaveCarShiptax;
    }

    public Integer getExchangeWithLicense() {
        return ExchangeWithLicense;
    }

    public void setExchangeWithLicense(Integer exchangeWithLicense) {
        ExchangeWithLicense = exchangeWithLicense;
    }

    public Integer getIsHaveCard() {
        return IsHaveCard;
    }

    public void setIsHaveCard(Integer isHaveCard) {
        IsHaveCard = isHaveCard;
    }

    public String getCarBody() {
        return CarBody;
    }

    public void setCarBody(String carBody) {
        CarBody = carBody;
    }

    public Integer getPracticalMileage() {
        return PracticalMileage;
    }

    public void setPracticalMileage(Integer practicalMileage) {
        PracticalMileage = practicalMileage;
    }

    public Integer getNewCarWarranty() {
        return NewCarWarranty;
    }

    public void setNewCarWarranty(Integer newCarWarranty) {
        NewCarWarranty = newCarWarranty;
    }

    public Boolean getButlerService() {
        return IsButlerService;
    }

    public void setButlerService(Boolean butlerService) {
        IsButlerService = butlerService;
    }

    public String getConditionGrade() {
        return ConditionGrade;
    }

    public void setConditionGrade(String conditionGrade) {
        ConditionGrade = conditionGrade;
    }

    public String getDynamicDetection() {
        return DynamicDetection;
    }

    public void setDynamicDetection(String dynamicDetection) {
        DynamicDetection = dynamicDetection;
    }

    public String getParkingNumber() {
        return ParkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        ParkingNumber = parkingNumber;
    }

    public String getOuterPic() {
        return OuterPic;
    }

    public void setOuterPic(String outerPic) {
        OuterPic = outerPic;
    }

    public String getInnerPic() {
        return InnerPic;
    }

    public void setInnerPic(String innerPic) {
        InnerPic = innerPic;
    }

    public String getSkeletonPic() {
        return SkeletonPic;
    }

    public void setSkeletonPic(String skeletonPic) {
        SkeletonPic = skeletonPic;
    }

    public String getOuterImplicitPic() {
        return OuterImplicitPic;
    }

    public void setOuterImplicitPic(String outerImplicitPic) {
        OuterImplicitPic = outerImplicitPic;
    }

    public String getSkeletonImplicitPic() {
        return SkeletonImplicitPic;
    }

    public void setSkeletonImplicitPic(String skeletonImplicitPic) {
        SkeletonImplicitPic = skeletonImplicitPic;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public BigDecimal getFee() {
        return Fee;
    }

    public void setFee(BigDecimal fee) {
        Fee = fee;
    }

    public BigDecimal getDealerPrice() {
        return dealerPrice;
    }

    public void setDealerPrice(BigDecimal dealerPrice) {
        this.dealerPrice = dealerPrice;
    }

    public String getLawLessBlame() {
        return lawLessBlame;
    }

    public void setLawLessBlame(String lawLessBlame) {
        this.lawLessBlame = lawLessBlame;
    }

    public String getModifiedVestingParty() {
        return modifiedVestingParty;
    }

    public void setModifiedVestingParty(String modifiedVestingParty) {
        this.modifiedVestingParty = modifiedVestingParty;
    }

    public String getFormalitiesGet() {
        return formalitiesGet;
    }

    public void setFormalitiesGet(String formalitiesGet) {
        this.formalitiesGet = formalitiesGet;
    }

    public String getFormalitiesLost() {
        return formalitiesLost;
    }

    public void setFormalitiesLost(String formalitiesLost) {
        this.formalitiesLost = formalitiesLost;
    }

    public String getFormalitiesTransaction() {
        return formalitiesTransaction;
    }

    public void setFormalitiesTransaction(String formalitiesTransaction) {
        this.formalitiesTransaction = formalitiesTransaction;
    }

    public String getFormalitiesRetroactive() {
        return formalitiesRetroactive;
    }

    public void setFormalitiesRetroactive(String formalitiesRetroactive) {
        this.formalitiesRetroactive = formalitiesRetroactive;
    }

    public Integer getXcpCarId() {
        return xcpCarId;
    }

    public void setXcpCarId(Integer xcpCarId) {
        this.xcpCarId = xcpCarId;
    }

    public String getPriceUser() {
        return priceUser;
    }

    public void setPriceUser(String priceUser) {
        this.priceUser = priceUser;
    }

    public String getPriceUserMoblie() {
        return priceUserMoblie;
    }

    public void setPriceUserMoblie(String priceUserMoblie) {
        this.priceUserMoblie = priceUserMoblie;
    }

    public Integer getTransferMarketid() {
        return transferMarketid;
    }

    public void setTransferMarketid(Integer transferMarketid) {
        this.transferMarketid = transferMarketid;
    }

    public Integer getPublishTvuid() {
        return publishTvuid;
    }

    public void setPublishTvuid(Integer publishTvuid) {
        this.publishTvuid = publishTvuid;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getCarType() {
        return CarType;
    }

    public void setCarType(Integer carType) {
        CarType = carType;
    }

    public Integer getCarLocation() {
        return CarLocation;
    }

    public void setCarLocation(Integer carLocation) {
        CarLocation = carLocation;
    }

    public String getArrangeItemStr() {
        return ArrangeItemStr;
    }

    public void setArrangeItemStr(String arrangeItemStr) {
        ArrangeItemStr = arrangeItemStr;
    }

    public Integer getIsChangeFee() {
        return IsChangeFee;
    }

    public void setIsChangeFee(Integer isChangeFee) {
        IsChangeFee = isChangeFee;
    }

    public String getConditionGradeSmall() {
        return ConditionGradeSmall;
    }

    public void setConditionGradeSmall(String conditionGradeSmall) {
        ConditionGradeSmall = conditionGradeSmall;
    }

    public Integer getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        UniqueId = uniqueId;
    }

    public String getUniqueSerial() {
        return UniqueSerial;
    }

    public void setUniqueSerial(String uniqueSerial) {
        UniqueSerial = uniqueSerial;
    }

    public Date getScrapDate() {
        return ScrapDate;
    }

    public void setScrapDate(Date scrapDate) {
        ScrapDate = scrapDate;
    }

    public Integer getSelfInsurance() {
        return SelfInsurance;
    }

    public void setSelfInsurance(Integer selfInsurance) {
        SelfInsurance = selfInsurance;
    }

    public Date getAnnualValidity() {
        return AnnualValidity;
    }

    public void setAnnualValidity(Date annualValidity) {
        AnnualValidity = annualValidity;
    }

    public String getDeviceModel() {
        return DeviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        DeviceModel = deviceModel;
    }

    public Integer getProxyTvaID() {
        return ProxyTvaID;
    }

    public void setProxyTvaID(Integer proxyTvaID) {
        ProxyTvaID = proxyTvaID;
    }

    public String getChakeVersion() {
        return ChakeVersion;
    }

    public void setChakeVersion(String chakeVersion) {
        ChakeVersion = chakeVersion;
    }

    public Integer getSourceFrom() {
        return SourceFrom;
    }

    public void setSourceFrom(Integer sourceFrom) {
        SourceFrom = sourceFrom;
    }

    public Integer getIsBubbleCar() {
        return IsBubbleCar;
    }

    public void setIsBubbleCar(Integer isBubbleCar) {
        IsBubbleCar = isBubbleCar;
    }

    public Integer getClientId() {
        return ClientId;
    }

    public void setClientId(Integer clientId) {
        ClientId = clientId;
    }

    public String getMobileDeviceOS() {
        return MobileDeviceOS;
    }

    public void setMobileDeviceOS(String mobileDeviceOS) {
        MobileDeviceOS = mobileDeviceOS;
    }

    public Double getProxyFee() {
        return ProxyFee;
    }

    public void setProxyFee(Double proxyFee) {
        ProxyFee = proxyFee;
    }

    public String getCarConfigKey() {
        return CarConfigKey;
    }

    public void setCarConfigKey(String carConfigKey) {
        CarConfigKey = carConfigKey;
    }

    public Integer getPapers() {
        return Papers;
    }

    public void setPapers(Integer papers) {
        Papers = papers;
    }

    public Integer getPeccancyDays() {
        return PeccancyDays;
    }

    public void setPeccancyDays(Integer peccancyDays) {
        PeccancyDays = peccancyDays;
    }

    public Integer getPeccancyScore() {
        return PeccancyScore;
    }

    public void setPeccancyScore(Integer peccancyScore) {
        PeccancyScore = peccancyScore;
    }

    public Integer getPeccancyYuan() {
        return PeccancyYuan;
    }

    public void setPeccancyYuan(Integer peccancyYuan) {
        PeccancyYuan = peccancyYuan;
    }

    public Integer getWtVIN() {
        return wtVIN;
    }

    public void setWtVIN(Integer wtVIN) {
        this.wtVIN = wtVIN;
    }

    public Integer getWtLicenseCar() {
        return wtLicenseCar;
    }

    public void setWtLicenseCar(Integer wtLicenseCar) {
        this.wtLicenseCar = wtLicenseCar;
    }

    public Integer getWtEngineNo() {
        return wtEngineNo;
    }

    public void setWtEngineNo(Integer wtEngineNo) {
        this.wtEngineNo = wtEngineNo;
    }

    public Integer getJQSelfInsurance() {
        return JQSelfInsurance;
    }

    public void setJQSelfInsurance(Integer JQSelfInsurance) {
        this.JQSelfInsurance = JQSelfInsurance;
    }

    public Integer getIsSmallReport() {
        return IsSmallReport;
    }

    public void setIsSmallReport(Integer isSmallReport) {
        IsSmallReport = isSmallReport;
    }

    public Integer getIsAnnualValidity() {
        return IsAnnualValidity;
    }

    public void setIsAnnualValidity(Integer isAnnualValidity) {
        IsAnnualValidity = isAnnualValidity;
    }

    public String getAppearancePaint() {
        return AppearancePaint;
    }

    public void setAppearancePaint(String appearancePaint) {
        AppearancePaint = appearancePaint;
    }

    public String getSkeletonPaint() {
        return SkeletonPaint;
    }

    public void setSkeletonPaint(String skeletonPaint) {
        SkeletonPaint = skeletonPaint;
    }

    public Integer getEid() {
        return Eid;
    }

    public void setEid(Integer eid) {
        Eid = eid;
    }

    public Double getDealerPriceTotal() {
        return dealerPriceTotal;
    }

    public void setDealerPriceTotal(Double dealerPriceTotal) {
        this.dealerPriceTotal = dealerPriceTotal;
    }

    public Integer getIsLedger() {
        return isLedger;
    }

    public void setIsLedger(Integer isLedger) {
        this.isLedger = isLedger;
    }

    public String getRedbookName() {
        return RedbookName;
    }

    public void setRedbookName(String redbookName) {
        RedbookName = redbookName;
    }

    public String getSuperiorName() {
        return SuperiorName;
    }

    public void setSuperiorName(String superiorName) {
        SuperiorName = superiorName;
    }

    public Integer getCertificateCard() {
        return CertificateCard;
    }

    public void setCertificateCard(Integer certificateCard) {
        CertificateCard = certificateCard;
    }

    public Integer getFactoryCode() {
        return FactoryCode;
    }

    public void setFactoryCode(Integer factoryCode) {
        FactoryCode = factoryCode;
    }

    public Integer getNewCarPhoto() {
        return NewCarPhoto;
    }

    public void setNewCarPhoto(Integer newCarPhoto) {
        NewCarPhoto = newCarPhoto;
    }

    public Integer getTheNewCar() {
        return TheNewCar;
    }

    public void setTheNewCar(Integer theNewCar) {
        TheNewCar = theNewCar;
    }

    public Integer getMaintainManual() {
        return MaintainManual;
    }

    public void setMaintainManual(Integer maintainManual) {
        MaintainManual = maintainManual;
    }

    public Integer getEnvironmentalID() {
        return EnvironmentalID;
    }

    public void setEnvironmentalID(Integer environmentalID) {
        EnvironmentalID = environmentalID;
    }

    public Integer getToVINCarModel() {
        return toVINCarModel;
    }

    public void setToVINCarModel(Integer toVINCarModel) {
        this.toVINCarModel = toVINCarModel;
    }

    public String getToCarModel() {
        return toCarModel;
    }

    public void setToCarModel(String toCarModel) {
        this.toCarModel = toCarModel;
    }

    public String getMaintenanceID() {
        return MaintenanceID;
    }

    public void setMaintenanceID(String maintenanceID) {
        MaintenanceID = maintenanceID;
    }

    public Integer getU2Status() {
        return U2Status;
    }

    public void setU2Status(Integer u2Status) {
        U2Status = u2Status;
    }

    public Integer getRecheckStatus() {
        return RecheckStatus;
    }

    public void setRecheckStatus(Integer recheckStatus) {
        RecheckStatus = recheckStatus;
    }

    public String getRecheckExplain() {
        return RecheckExplain;
    }

    public void setRecheckExplain(String recheckExplain) {
        RecheckExplain = recheckExplain;
    }

    public Integer getSourceTo() {
        return SourceTo;
    }

    public void setSourceTo(Integer sourceTo) {
        SourceTo = sourceTo;
    }

    public String getYxpXdrAccout() {
        return YxpXdrAccout;
    }

    public void setYxpXdrAccout(String yxpXdrAccout) {
        YxpXdrAccout = yxpXdrAccout;
    }

    public String getYxpXdrName() {
        return YxpXdrName;
    }

    public void setYxpXdrName(String yxpXdrName) {
        YxpXdrName = yxpXdrName;
    }

    public Integer getIsBubbleCarAuto() {
        return IsBubbleCarAuto;
    }

    public void setIsBubbleCarAuto(Integer isBubbleCarAuto) {
        IsBubbleCarAuto = isBubbleCarAuto;
    }

    public String getConditionGradeAuto() {
        return ConditionGradeAuto;
    }

    public void setConditionGradeAuto(String conditionGradeAuto) {
        ConditionGradeAuto = conditionGradeAuto;
    }

    public Integer getConditionScoreAuto() {
        return ConditionScoreAuto;
    }

    public void setConditionScoreAuto(Integer conditionScoreAuto) {
        ConditionScoreAuto = conditionScoreAuto;
    }

    public String getTeShuYongTu() {
        return TeShuYongTu;
    }

    public void setTeShuYongTu(String teShuYongTu) {
        TeShuYongTu = teShuYongTu;
    }

    public Date getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Date rowVersion) {
        this.rowVersion = rowVersion;
    }

    public Integer getPicServerType() {
        return PicServerType;
    }

    public void setPicServerType(Integer picServerType) {
        PicServerType = picServerType;
    }

    public Integer getSourceType() {
        return SourceType;
    }

    public void setSourceType(Integer sourceType) {
        SourceType = sourceType;
    }

    public String getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
    }

    public String getCheckLevelDesc() {
        return checkLevelDesc;
    }

    public void setCheckLevelDesc(String checkLevelDesc) {
        this.checkLevelDesc = checkLevelDesc;
    }

    @Override
    public String toString() {
        return "CarInfoDTO{" +
                "CarID=" + CarID +
                ", TaskId=" + TaskId +
                ", Bodywork=" + Bodywork +
                ", EngineNo='" + EngineNo + '\'' +
                ", vin='" + vin + '\'' +
                ", RegisterDate=" + RegisterDate +
                ", LicenseYear=" + LicenseYear +
                ", CarFullName='" + CarFullName + '\'' +
                ", CarBasicId=" + CarBasicId +
                ", SerieId=" + SerieId +
                ", ProducerId=" + ProducerId +
                ", BranId=" + BranId +
                ", Transmission=" + Transmission +
                ", Exhaust=" + Exhaust +
                ", CarUseType=" + CarUseType +
                ", OrginalPrice=" + OrginalPrice +
                ", FoAssuranceDate=" + FoAssuranceDate +
                ", IsHaveAssuranceRecord=" + IsHaveAssuranceRecord +
                ", CarConfigInfo='" + CarConfigInfo + '\'' +
                ", Mileage=" + Mileage +
                ", IsEffluentYellow='" + IsEffluentYellow + '\'' +
                ", AnnualDetection='" + AnnualDetection + '\'' +
                ", CarBodyColor='" + CarBodyColor + '\'' +
                ", CarOtherConfigInfo='" + CarOtherConfigInfo + '\'' +
                ", LicensProvince=" + LicensProvince +
                ", LicensCity=" + LicensCity +
                ", IsNew=" + IsNew +
                ", TransferDate=" + TransferDate +
                ", IsHaveMainTenance=" + IsHaveMainTenance +
                ", IsHavePurchaseTax=" + IsHavePurchaseTax +
                ", CarShipTaxExpireYear=" + CarShipTaxExpireYear +
                ", DetectionYear=" + DetectionYear +
                ", IsHaveFoAssurance=" + IsHaveFoAssurance +
                ", FoAssuranceDateYear=" + FoAssuranceDateYear +
                ", IsHaveComAssurance=" + IsHaveComAssurance +
                ", IsHaveComAssuranceYear=" + IsHaveComAssuranceYear +
                ", ComAssuranceMoney='" + ComAssuranceMoney + '\'' +
                ", LicenseCar='" + LicenseCar + '\'' +
                ", IsCompleteEngineNumber=" + IsCompleteEngineNumber +
                ", IsChangeEngineNumber=" + IsChangeEngineNumber +
                ", CarModel='" + CarModel + '\'' +
                ", IsInDetail=" + IsInDetail +
                ", Explain='" + Explain + '\'' +
                ", DetectOuterInfo='" + DetectOuterInfo + '\'' +
                ", DetectInnerInfo='" + DetectInnerInfo + '\'' +
                ", DetectSkeletonInfo='" + DetectSkeletonInfo + '\'' +
                ", OuterSheetMetal='" + OuterSheetMetal + '\'' +
                ", SkeletonSheetMetal='" + SkeletonSheetMetal + '\'' +
                ", Owner=" + Owner +
                ", DrivingCertification=" + DrivingCertification +
                ", Registration=" + Registration +
                ", BuyingReceipt=" + BuyingReceipt +
                ", TransferInvoice=" + TransferInvoice +
                ", TransferCount=" + TransferCount +
                ", ExplainBook=" + ExplainBook +
                ", CarKeys=" + CarKeys +
                ", MaintenanceKM=" + MaintenanceKM +
                ", LicenseCarStatue=" + LicenseCarStatue +
                ", CarOriginalColor='" + CarOriginalColor + '\'' +
                ", FuelType=" + FuelType +
                ", NoticeNumber='" + NoticeNumber + '\'' +
                ", IsRefit=" + IsRefit +
                ", RefitContent='" + RefitContent + '\'' +
                ", ChairContent='" + ChairContent + '\'' +
                ", CityAreaId=" + CityAreaId +
                ", GasbagContent='" + GasbagContent + '\'' +
                ", IsHaveCarShiptax=" + IsHaveCarShiptax +
                ", ExchangeWithLicense=" + ExchangeWithLicense +
                ", IsHaveCard=" + IsHaveCard +
                ", CarBody='" + CarBody + '\'' +
                ", PracticalMileage=" + PracticalMileage +
                ", NewCarWarranty=" + NewCarWarranty +
                ", IsButlerService=" + IsButlerService +
                ", ConditionGrade='" + ConditionGrade + '\'' +
                ", DynamicDetection='" + DynamicDetection + '\'' +
                ", ParkingNumber='" + ParkingNumber + '\'' +
                ", OuterPic='" + OuterPic + '\'' +
                ", InnerPic='" + InnerPic + '\'' +
                ", SkeletonPic='" + SkeletonPic + '\'' +
                ", OuterImplicitPic='" + OuterImplicitPic + '\'' +
                ", SkeletonImplicitPic='" + SkeletonImplicitPic + '\'' +
                ", transferType=" + transferType +
                ", Fee=" + Fee +
                ", dealerPrice=" + dealerPrice +
                ", lawLessBlame='" + lawLessBlame + '\'' +
                ", modifiedVestingParty='" + modifiedVestingParty + '\'' +
                ", formalitiesGet='" + formalitiesGet + '\'' +
                ", formalitiesLost='" + formalitiesLost + '\'' +
                ", formalitiesTransaction='" + formalitiesTransaction + '\'' +
                ", formalitiesRetroactive='" + formalitiesRetroactive + '\'' +
                ", xcpCarId=" + xcpCarId +
                ", priceUser='" + priceUser + '\'' +
                ", priceUserMoblie='" + priceUserMoblie + '\'' +
                ", transferMarketid=" + transferMarketid +
                ", publishTvuid=" + publishTvuid +
                ", purchasePrice=" + purchasePrice +
                ", CarType=" + CarType +
                ", CarLocation=" + CarLocation +
                ", ArrangeItemStr='" + ArrangeItemStr + '\'' +
                ", IsChangeFee=" + IsChangeFee +
                ", ConditionGradeSmall='" + ConditionGradeSmall + '\'' +
                ", UniqueId=" + UniqueId +
                ", UniqueSerial='" + UniqueSerial + '\'' +
                ", ScrapDate=" + ScrapDate +
                ", SelfInsurance=" + SelfInsurance +
                ", AnnualValidity=" + AnnualValidity +
                ", DeviceModel='" + DeviceModel + '\'' +
                ", ProxyTvaID=" + ProxyTvaID +
                ", ChakeVersion='" + ChakeVersion + '\'' +
                ", SourceFrom=" + SourceFrom +
                ", IsBubbleCar=" + IsBubbleCar +
                ", ClientId=" + ClientId +
                ", MobileDeviceOS='" + MobileDeviceOS + '\'' +
                ", ProxyFee=" + ProxyFee +
                ", CarConfigKey='" + CarConfigKey + '\'' +
                ", Papers=" + Papers +
                ", PeccancyDays=" + PeccancyDays +
                ", PeccancyScore=" + PeccancyScore +
                ", PeccancyYuan=" + PeccancyYuan +
                ", wtVIN=" + wtVIN +
                ", wtLicenseCar=" + wtLicenseCar +
                ", wtEngineNo=" + wtEngineNo +
                ", JQSelfInsurance=" + JQSelfInsurance +
                ", IsSmallReport=" + IsSmallReport +
                ", IsAnnualValidity=" + IsAnnualValidity +
                ", AppearancePaint='" + AppearancePaint + '\'' +
                ", SkeletonPaint='" + SkeletonPaint + '\'' +
                ", Eid=" + Eid +
                ", dealerPriceTotal=" + dealerPriceTotal +
                ", isLedger=" + isLedger +
                ", RedbookName='" + RedbookName + '\'' +
                ", SuperiorName='" + SuperiorName + '\'' +
                ", CertificateCard=" + CertificateCard +
                ", FactoryCode=" + FactoryCode +
                ", NewCarPhoto=" + NewCarPhoto +
                ", TheNewCar=" + TheNewCar +
                ", MaintainManual=" + MaintainManual +
                ", EnvironmentalID=" + EnvironmentalID +
                ", toVINCarModel=" + toVINCarModel +
                ", toCarModel='" + toCarModel + '\'' +
                ", MaintenanceID='" + MaintenanceID + '\'' +
                ", U2Status=" + U2Status +
                ", RecheckStatus=" + RecheckStatus +
                ", RecheckExplain='" + RecheckExplain + '\'' +
                ", SourceTo=" + SourceTo +
                ", YxpXdrAccout='" + YxpXdrAccout + '\'' +
                ", YxpXdrName='" + YxpXdrName + '\'' +
                ", IsBubbleCarAuto=" + IsBubbleCarAuto +
                ", ConditionGradeAuto='" + ConditionGradeAuto + '\'' +
                ", ConditionScoreAuto=" + ConditionScoreAuto +
                ", TeShuYongTu='" + TeShuYongTu + '\'' +
                ", rowVersion=" + rowVersion +
                ", PicServerType=" + PicServerType +
                ", SourceType=" + SourceType +
                ", checkLevel='" + checkLevel + '\'' +
                ", checkLevelDesc='" + checkLevelDesc + '\'' +
                '}';
    }
}
