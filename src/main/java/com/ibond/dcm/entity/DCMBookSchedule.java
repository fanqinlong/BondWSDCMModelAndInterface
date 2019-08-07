package com.ibond.dcm.entity;
import com.ibond.dcm.utils.Utils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

@ApiModel(value = "簿记日程表")
public class DCMBookSchedule {

    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "债券名称", required = true)
    private String bondName;

    @ApiModelProperty(value = "备案日")
    private String recordDay;

    @ApiModelProperty(value = "决策日")
    private String policyDay;

    @ApiModelProperty(value = "公告日")
    private String publishDay;

    @ApiModelProperty(value = "簿记日")
    private String bookDay;

    @ApiModelProperty(value = "缴款日")
    private String paymentDay;

    @ApiModelProperty(value = "缴款日")
    private String outstandingDay;

    @ApiModelProperty(value = "发行对接人ID，用半角逗号隔开")
    private String issuePersonId;

    @ApiModelProperty(value = "发行对接人名称，用半角逗号隔开")
    private String issuePersonName;

    @ApiModelProperty(value = "DCM对接人ID，用半角逗号隔开")
    private String dcmPersonId;

    @ApiModelProperty(value = "DCM对接人名称，用半角逗号隔开")
    private String dcmPersonName;

    @ApiModelProperty(value = "销售对接人ID，用半角逗号隔开")
    private String salePersonId;

    @ApiModelProperty(value = "销售对接人名称，用半角逗号隔开")
    private String salePersonName;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "是否删除，[-1|否;1|是]")
    private Integer deleted;

    private Long creatorId;

    private String creatorName;

    private Date created;

    private Long modifierId;

    private String modifierName;

    private Date modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName == null ? null : bondName.trim();
    }

    public String getRecordDay() {
        return recordDay;
    }

    public void setRecordDay(String recordDay) {
        this.recordDay = recordDay == null ? null : recordDay.trim();
    }

    public String getPolicyDay() {
        return policyDay;
    }

    public void setPolicyDay(String policyDay) {
        this.policyDay = policyDay == null ? null : policyDay.trim();
    }

    public String getPublishDay() {
        return publishDay;
    }

    public void setPublishDay(String publishDay) {
        this.publishDay = publishDay == null ? null : publishDay.trim();
    }

    public String getBookDay() {
        return bookDay;
    }

    public void setBookDay(String bookDay) {
        this.bookDay = bookDay == null ? null : bookDay.trim();
    }

    public String getOutstandingDay() {
        return outstandingDay;
    }

    public void setOutstandingDay(String outstandingDay) {
        this.outstandingDay = outstandingDay;
    }

    public String getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(String paymentDay) {
        this.paymentDay = paymentDay == null ? null : paymentDay.trim();
    }

    public String getIssuePersonId() {
        return issuePersonId;
    }

    public void setIssuePersonId(String issuePersonId) {
        this.issuePersonId = issuePersonId == null ? null : issuePersonId.trim();
    }

    public String getIssuePersonName() {
        return issuePersonName;
    }

    public void setIssuePersonName(String issuePersonName) {
        this.issuePersonName = issuePersonName == null ? null : issuePersonName.trim();
    }

    public String getDcmPersonId() {
        return dcmPersonId;
    }

    public void setDcmPersonId(String dcmPersonId) {
        this.dcmPersonId = dcmPersonId == null ? null : dcmPersonId.trim();
    }

    public String getDcmPersonName() {
        return dcmPersonName;
    }

    public void setDcmPersonName(String dcmPersonName) {
        this.dcmPersonName = dcmPersonName == null ? null : dcmPersonName.trim();
    }

    public String getSalePersonId() {
        return salePersonId;
    }

    public void setSalePersonId(String salePersonId) {
        this.salePersonId = salePersonId == null ? null : salePersonId.trim();
    }

    public String getSalePersonName() {
        return salePersonName;
    }

    public void setSalePersonName(String salePersonName) {
        this.salePersonName = salePersonName == null ? null : salePersonName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @ApiModelProperty(value = "发行对接人列表")
    private List<ComboEntity> issuePerson;
    @ApiModelProperty(value = "DCM对接人列表")
    private List<ComboEntity> dcmPerson;
    @ApiModelProperty(value = "销售对接人列表")
    private List<ComboEntity> salePerson;

    public List<ComboEntity> getIssuePerson() {
        return Utils.generateItemList(issuePersonId, issuePersonName);
    }

    public List<ComboEntity> getDcmPerson() {
        return Utils.generateItemList(dcmPersonId, dcmPersonName);
    }

    public List<ComboEntity> getSalePerson() {
        return Utils.generateItemList(salePersonId, salePersonName);
    }
}