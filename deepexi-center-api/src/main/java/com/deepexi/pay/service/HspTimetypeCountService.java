package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.HspTimetypeCount;
import com.deepexi.pay.domain.dto.HspTimetypeCountDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * hsp_timetype_count
 */
public interface HspTimetypeCountService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<HspTimetypeCount> findPage(HspTimetypeCount eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<HspTimetypeCount> findAll(HspTimetypeCount eo);

    /**
      获取详情
    * @return
    */
    HspTimetypeCount detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,HspTimetypeCount eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(HspTimetypeCount eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(String pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(String...pk);
}