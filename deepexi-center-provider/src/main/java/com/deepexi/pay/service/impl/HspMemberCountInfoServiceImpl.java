package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.HspMemberCountInfo;
import com.deepexi.pay.service.HspMemberCountInfoService;
import com.deepexi.pay.mapper.HspMemberCountInfoMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class HspMemberCountInfoServiceImpl implements HspMemberCountInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HspMemberCountInfoMapper hspMemberCountInfoMapper;

    @Override
    public PageBean<HspMemberCountInfo> findPage(HspMemberCountInfo eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HspMemberCountInfo> pages =  hspMemberCountInfoMapper.findList(eo);
        return new PageBean<HspMemberCountInfo>(pages);
    }

    @Override
    public List<HspMemberCountInfo> findAll(HspMemberCountInfo eo) {
        List<HspMemberCountInfo> list = hspMemberCountInfoMapper.findList(eo);
        return list;
    }
    @Override
    public HspMemberCountInfo detail(String pk) {
        HspMemberCountInfo eo = hspMemberCountInfoMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,HspMemberCountInfo eo) {
        HspMemberCountInfo old = hspMemberCountInfoMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = hspMemberCountInfoMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(HspMemberCountInfo eo) {
        int result = hspMemberCountInfoMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = hspMemberCountInfoMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = hspMemberCountInfoMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}