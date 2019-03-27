package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.HspTimetypeCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  HspTimetypeCountMapper extends BaseMapper<HspTimetypeCount> {

    List<HspTimetypeCount> findList(@Param("eo")  HspTimetypeCount eo);

    int deleteByIds(@Param("ids") List<String> ids);

}