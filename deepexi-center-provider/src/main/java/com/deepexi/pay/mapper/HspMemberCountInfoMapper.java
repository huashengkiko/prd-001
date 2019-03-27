package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.HspMemberCountInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  HspMemberCountInfoMapper extends BaseMapper<HspMemberCountInfo> {

    List<HspMemberCountInfo> findList(@Param("eo")  HspMemberCountInfo eo);

    int deleteByIds(@Param("ids") List<String> ids);

}