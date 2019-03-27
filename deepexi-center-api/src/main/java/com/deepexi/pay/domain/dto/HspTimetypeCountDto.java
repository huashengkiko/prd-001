package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.HspTimetypeCount;
import java.util.Collection;
import java.util.List;

/**
* @desc hsp_timetype_count
* @author admin
*/
public class HspTimetypeCountDto extends HspTimetypeCount{

public HspTimetypeCountDto(){};

public HspTimetypeCountDto(HspTimetypeCount eo) {
    this.setId(eo.getId());
    this.setCountDaily(eo.getCountDaily());
    this.setCountWeekly(eo.getCountWeekly());
    this.setCountPermonth(eo.getCountPermonth());
    this.setCountType(eo.getCountType());
    this.setTimeType(eo.getTimeType());
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

