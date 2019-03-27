package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.HspMemberShareInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  HspMemberShareInfoMapper extends BaseMapper<HspMemberShareInfo> {

    List<HspMemberShareInfo> findList(@Param("eo")  HspMemberShareInfo eo);

    int deleteByIds(@Param("ids") List<String> ids);

}