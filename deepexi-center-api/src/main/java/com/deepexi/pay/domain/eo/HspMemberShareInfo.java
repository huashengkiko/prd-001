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
* @desc hsp_member_share_info
* @author admin
*/
//@ApiModel(description = "hsp_member_share_info")
public class HspMemberShareInfo{

// @ApiModelProperty(value = "")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "账户ID")
    @TableField(value = "`account_id`")
    private String accountId;
// @ApiModelProperty(value = "活动/商品/文章ID")
    @TableField(value = "`type_id`")
    private String typeId;
// @ApiModelProperty(value = "分享类型:1 商品分享:2 文章分享:3")
    @TableField(value = "`type`")
    private Integer  type;
// @ApiModelProperty(value = "标题")
    @TableField(value = "`title`")
    private String title;
// @ApiModelProperty(value = "微信:1 QQ:2 微博:3 短信:4 邮件:5")
    @TableField(value = "`channel`")
    private Integer  channel;
// @ApiModelProperty(value = "分享次数")
    @TableField(value = "`share_num`")
    private Integer  shareNum;
// @ApiModelProperty(value = "被分享次数")
    @TableField(value = "`be_share_num`")
    private Integer  beShareNum;
// @ApiModelProperty(value = "带来浏览量")
    @TableField(value = "`browse_num`")
    private Integer  browseNum;
// @ApiModelProperty(value = "带来注册会员数")
    @TableField(value = "`register_num`")
    private Integer  registerNum;
// @ApiModelProperty(value = "带来付费会员数")
    @TableField(value = "`paid_member_num`")
    private Integer  paidMemberNum;
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

    public void setType(Integer  type){
    this.type = type;
    }

    public Integer  getType(){
    return this.type;
    }

    public void setTitle(String title){
    this.title = title;
    }

    public String getTitle(){
    return this.title;
    }

    public void setChannel(Integer  channel){
    this.channel = channel;
    }

    public Integer  getChannel(){
    return this.channel;
    }

    public void setShareNum(Integer  shareNum){
    this.shareNum = shareNum;
    }

    public Integer  getShareNum(){
    return this.shareNum;
    }

    public void setBeShareNum(Integer  beShareNum){
    this.beShareNum = beShareNum;
    }

    public Integer  getBeShareNum(){
    return this.beShareNum;
    }

    public void setBrowseNum(Integer  browseNum){
    this.browseNum = browseNum;
    }

    public Integer  getBrowseNum(){
    return this.browseNum;
    }

    public void setRegisterNum(Integer  registerNum){
    this.registerNum = registerNum;
    }

    public Integer  getRegisterNum(){
    return this.registerNum;
    }

    public void setPaidMemberNum(Integer  paidMemberNum){
    this.paidMemberNum = paidMemberNum;
    }

    public Integer  getPaidMemberNum(){
    return this.paidMemberNum;
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

