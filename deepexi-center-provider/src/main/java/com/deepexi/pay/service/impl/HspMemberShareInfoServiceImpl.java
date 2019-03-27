package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.HspMemberShareInfo;
import com.deepexi.pay.service.HspMemberShareInfoService;
import com.deepexi.pay.mapper.HspMemberShareInfoMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class HspMemberShareInfoServiceImpl implements HspMemberShareInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HspMemberShareInfoMapper hspMemberShareInfoMapper;

    @Override
    public PageBean<HspMemberShareInfo> findPage(HspMemberShareInfo eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HspMemberShareInfo> pages =  hspMemberShareInfoMapper.findList(eo);
        return new PageBean<HspMemberShareInfo>(pages);
    }

    @Override
    public List<HspMemberShareInfo> findAll(HspMemberShareInfo eo) {
        List<HspMemberShareInfo> list = hspMemberShareInfoMapper.findList(eo);
        return list;
    }
    @Override
    public HspMemberShareInfo detail(String pk) {
        HspMemberShareInfo eo = hspMemberShareInfoMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,HspMemberShareInfo eo) {
        HspMemberShareInfo old = hspMemberShareInfoMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = hspMemberShareInfoMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(HspMemberShareInfo eo) {
        int result = hspMemberShareInfoMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = hspMemberShareInfoMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = hspMemberShareInfoMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}