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
* @desc hsp_timetype_count
* @author admin
*/
//@ApiModel(description = "hsp_timetype_count")
public class HspTimetypeCount{

// @ApiModelProperty(value = "")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "日统计总数")
    @TableField(value = "`count_daily`")
    private Integer  countDaily;
// @ApiModelProperty(value = "")
    @TableField(value = "`count_weekly`")
    private Integer  countWeekly;
// @ApiModelProperty(value = "")
    @TableField(value = "`count_permonth`")
    private Integer  countPermonth;
// @ApiModelProperty(value = "")
    @TableField(value = "`count_type`")
    private String countType;
// @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`time_type`")
    private Date timeType;
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

    public void setCountDaily(Integer  countDaily){
    this.countDaily = countDaily;
    }

    public Integer  getCountDaily(){
    return this.countDaily;
    }

    public void setCountWeekly(Integer  countWeekly){
    this.countWeekly = countWeekly;
    }

    public Integer  getCountWeekly(){
    return this.countWeekly;
    }

    public void setCountPermonth(Integer  countPermonth){
    this.countPermonth = countPermonth;
    }

    public Integer  getCountPermonth(){
    return this.countPermonth;
    }

    public void setCountType(String countType){
    this.countType = countType;
    }

    public String getCountType(){
    return this.countType;
    }

    public void setTimeType(Date timeType){
    this.timeType = timeType;
    }

    public Date getTimeType(){
    return this.timeType;
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

