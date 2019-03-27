package com.deepexi.pay.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc hsp_member_count_info
* @author admin
*/
//@ApiModel(description = "hsp_member_count_info")
public class HspMemberCountInfo{

// @ApiModelProperty(value = "")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "账户ID")
    @TableField(value = "`account_id`")
    private String accountId;
// @ApiModelProperty(value = "浏览对应的：活动ID,商品ID，文章ID")
    @TableField(value = "`type_id`")
    private String typeId;
// @ApiModelProperty(value = "名称")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "类型：0 活动ID  1 商品ID  2 文章ID")
    @TableField(value = "`type`")
    private String type;
// @ApiModelProperty(value = "浏览的商品类型")
    @TableField(value = "`product_item_name`")
    private String productItemName;
// @ApiModelProperty(value = "浏览的商品类型")
    @TableField(value = "`product_item_id`")
    private String productItemId;
// @ApiModelProperty(value = "推送时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`push_date`")
    private Date pushDate;
// @ApiModelProperty(value = "是否推送 1/0")
    @TableField(value = "`push`")
    private Boolean push;
// @ApiModelProperty(value = "浏览时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`look_date`")
    private Date lookDate;
// @ApiModelProperty(value = "是否浏览 1/0")
    @TableField(value = "`look`")
    private Boolean look;
// @ApiModelProperty(value = "参加时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`partake_date`")
    private Date partakeDate;
// @ApiModelProperty(value = "是否参加 1/0")
    @TableField(value = "`partake`")
    private Boolean partake;
// @ApiModelProperty(value = "付款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`payment_date`")
    private Date paymentDate;
// @ApiModelProperty(value = "是否付款 1/0")
    @TableField(value = "`payment`")
    private Boolean payment;
// @ApiModelProperty(value = "分享时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`share_date`")
    private Date shareDate;
// @ApiModelProperty(value = "是否分享 1/0")
    @TableField(value = "`share`")
    private Boolean share;
// @ApiModelProperty(value = "推送ID，用于区分每次推送和浏览的对应关系")
    @TableField(value = "`push_id`")
    private String pushId;
// @ApiModelProperty(value = "推送类型，0 短信 ，1 微信")
    @TableField(value = "`push_type`")
    private String pushType;
// @ApiModelProperty(value = "支付ID")
    @TableField(value = "`pay_id`")
    private String payId;
// @ApiModelProperty(value = "订单ID，对应付款时间")
    @TableField(value = "`order_id`")
    private String orderId;
// @ApiModelProperty(value = "租户")
    @TableField(value = "`tenant_code`")
    private String tenantCode;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`created_at`")
    private Date createdAt;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`updated_at`")
    private Date updatedAt;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`updated_by`")
    private String updatedBy;
// @ApiModelProperty(value = "版本记录,修改时自增")
    @TableField(value = "`version`")
    private Integer  version;
// @ApiModelProperty(value = "删除标志 1=已删除, 0=未删除")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;
// @ApiModelProperty(value = "remark1")
    @TableField(value = "`remark1`")
    private String remark1;
// @ApiModelProperty(value = "remark2")
    @TableField(value = "`remark2`")
    private String remark2;
// @ApiModelProperty(value = "remark3")
    @TableField(value = "`remark3`")
    private String remark3;
// @ApiModelProperty(value = "remark4")
    @TableField(value = "`remark4`")
    private String remark4;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setAccountId(String accountId){
    this.accountId = accountId;
    }

    public String getAccountId(){
    return this.accountId;
    }

    public void setTypeId(String typeId){
    this.typeId = typeId;
    }

    public String getTypeId(){
    return this.typeId;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
    }

    public void setProductItemName(String productItemName){
    this.productItemName = productItemName;
    }

    public String getProductItemName(){
    return this.productItemName;
    }

    public void setProductItemId(String productItemId){
    this.productItemId = productItemId;
    }

    public String getProductItemId(){
    return this.productItemId;
    }

    public void setPushDate(Date pushDate){
    this.pushDate = pushDate;
    }

    public Date getPushDate(){
    return this.pushDate;
    }

    public void setPush(Boolean push){
    this.push = push;
    }

    public Boolean getPush(){
    return this.push;
    }

    public void setLookDate(Date lookDate){
    this.lookDate = lookDate;
    }

    public Date getLookDate(){
    return this.lookDate;
    }

    public void setLook(Boolean look){
    this.look = look;
    }

    public Boolean getLook(){
    return this.look;
    }

    public void setPartakeDate(Date partakeDate){
    this.partakeDate = partakeDate;
    }

    public Date getPartakeDate(){
    return this.partakeDate;
    }

    public void setPartake(Boolean partake){
    this.partake = partake;
    }

    public Boolean getPartake(){
    return this.partake;
    }

    public void setPaymentDate(Date paymentDate){
    this.paymentDate = paymentDate;
    }

    public Date getPaymentDate(){
    return this.paymentDate;
    }

    public void setPayment(Boolean payment){
    this.payment = payment;
    }

    public Boolean getPayment(){
    return this.payment;
    }

    public void setShareDate(Date shareDate){
    this.shareDate = shareDate;
    }

    public Date getShareDate(){
    return this.shareDate;
    }

    public void setShare(Boolean share){
    this.share = share;
    }

    public Boolean getShare(){
    return this.share;
    }

    public void setPushId(String pushId){
    this.pushId = pushId;
    }

    public String getPushId(){
    return this.pushId;
    }

    public void setPushType(String pushType){
    this.pushType = pushType;
    }

    public String getPushType(){
    return this.pushType;
    }

    public void setPayId(String payId){
    this.payId = payId;
    }

    public String getPayId(){
    return this.payId;
    }

    public void setOrderId(String orderId){
    this.orderId = orderId;
    }

    public String getOrderId(){
    return this.orderId;
    }

    public void setTenantCode(String tenantCode){
    this.tenantCode = tenantCode;
    }

    public String getTenantCode(){
    return this.tenantCode;
    }

    public void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
    return this.createdAt;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
    return this.updatedAt;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setVersion(Integer  version){
    this.version = version;
    }

    public Integer  getVersion(){
    return this.version;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }

    public void setRemark1(String remark1){
    this.remark1 = remark1;
    }

    public String getRemark1(){
    return this.remark1;
    }

    public void setRemark2(String remark2){
    this.remark2 = remark2;
    }

    public String getRemark2(){
    return this.remark2;
    }

    public void setRemark3(String remark3){
    this.remark3 = remark3;
    }

    public String getRemark3(){
    return this.remark3;
    }

    public void setRemark4(String remark4){
    this.remark4 = remark4;
    }

    public String getRemark4(){
    return this.remark4;
    }


}

