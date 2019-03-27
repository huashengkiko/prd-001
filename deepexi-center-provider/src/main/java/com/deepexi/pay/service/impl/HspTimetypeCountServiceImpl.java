package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.HspTimetypeCount;
import com.deepexi.pay.service.HspTimetypeCountService;
import com.deepexi.pay.mapper.HspTimetypeCountMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class HspTimetypeCountServiceImpl implements HspTimetypeCountService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HspTimetypeCountMapper hspTimetypeCountMapper;

    @Override
    public PageBean<HspTimetypeCount> findPage(HspTimetypeCount eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HspTimetypeCount> pages =  hspTimetypeCountMapper.findList(eo);
        return new PageBean<HspTimetypeCount>(pages);
    }

    @Override
    public List<HspTimetypeCount> findAll(HspTimetypeCount eo) {
        List<HspTimetypeCount> list = hspTimetypeCountMapper.findList(eo);
        return list;
    }
    @Override
    public HspTimetypeCount detail(String pk) {
        HspTimetypeCount eo = hspTimetypeCountMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,HspTimetypeCount eo) {
        HspTimetypeCount old = hspTimetypeCountMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = hspTimetypeCountMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(HspTimetypeCount eo) {
        int result = hspTimetypeCountMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = hspTimetypeCountMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = hspTimetypeCountMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}