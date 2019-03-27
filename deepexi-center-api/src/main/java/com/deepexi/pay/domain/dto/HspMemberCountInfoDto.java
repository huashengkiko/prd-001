package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.HspMemberCountInfo;
import java.util.Collection;
import java.util.List;

/**
* @desc hsp_member_count_info
* @author admin
*/
public class HspMemberCountInfoDto extends HspMemberCountInfo{

public HspMemberCountInfoDto(){};

public HspMemberCountInfoDto(HspMemberCountInfo eo) {
    this.setId(eo.getId());
    this.setAccountId(eo.getAccountId());
    this.setTypeId(eo.getTypeId());
    this.setName(eo.getName());
    this.setType(eo.getType());
    this.setProductItemName(eo.getProductItemName());
    this.setProductItemId(eo.getProductItemId());
    this.setPushDate(eo.getPushDate());
    this.setPush(eo.getPush());
    this.setLookDate(eo.getLookDate());
    this.setLook(eo.getLook());
    this.setPartakeDate(eo.getPartakeDate());
    this.setPartake(eo.getPartake());
    this.setPaymentDate(eo.getPaymentDate());
    this.setPayment(eo.getPayment());
    this.setShareDate(eo.getShareDate());
    this.setShare(eo.getShare());
    this.setPushId(eo.getPushId());
    this.setPushType(eo.getPushType());
    this.setPayId(eo.getPayId());
    this.setOrderId(eo.getOrderId());
    this.setTenantCode(eo.getTenantCode());
    this.setCreatedAt(eo.getCreatedAt());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setVersion(eo.getVersion());
    this.setDr(eo.getDr());
    this.setRemark1(eo.getRemark1());
    this.setRemark2(eo.getRemark2());
    this.setRemark3(eo.getRemark3());
    this.setRemark4(eo.getRemark4());
}
}

