package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.HspMemberCountInfo;
import com.deepexi.pay.domain.dto.HspMemberCountInfoDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * hsp_member_count_info
 */
public interface HspMemberCountInfoService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<HspMemberCountInfo> findPage(HspMemberCountInfo eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<HspMemberCountInfo> findAll(HspMemberCountInfo eo);

    /**
      获取详情
    * @return
    */
    HspMemberCountInfo detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,HspMemberCountInfo eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(HspMemberCountInfo eo);

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