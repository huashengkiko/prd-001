package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.HspMemberShareInfo;
import com.deepexi.pay.domain.dto.HspMemberShareInfoDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * hsp_member_share_info
 */
public interface HspMemberShareInfoService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<HspMemberShareInfo> findPage(HspMemberShareInfo eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<HspMemberShareInfo> findAll(HspMemberShareInfo eo);

    /**
      获取详情
    * @return
    */
    HspMemberShareInfo detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,HspMemberShareInfo eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(HspMemberShareInfo eo);

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