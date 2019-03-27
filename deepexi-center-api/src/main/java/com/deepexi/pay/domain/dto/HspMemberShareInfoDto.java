package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.HspMemberShareInfo;
import java.util.Collection;
import java.util.List;

/**
* @desc hsp_member_share_info
* @author admin
*/
public class HspMemberShareInfoDto extends HspMemberShareInfo{

public HspMemberShareInfoDto(){};

public HspMemberShareInfoDto(HspMemberShareInfo eo) {
    this.setId(eo.getId());
    this.setAccountId(eo.getAccountId());
    this.setTypeId(eo.getTypeId());
    this.setType(eo.getType());
    this.setTitle(eo.getTitle());
    this.setChannel(eo.getChannel());
    this.setShareNum(eo.getShareNum());
    this.setBeShareNum(eo.getBeShareNum());
    this.setBrowseNum(eo.getBrowseNum());
    this.setRegisterNum(eo.getRegisterNum());
    this.setPaidMemberNum(eo.getPaidMemberNum());
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

