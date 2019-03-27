package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.HspMemberCountInfoService;
import com.deepexi.pay.domain.eo.HspMemberCountInfo;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/hsp_member_count_info", description = "$desc")
@RestController
@RequestMapping("/api/v1/hspMemberCountInfos")
public class  HspMemberCountInfoController {

    @Autowired
    private HspMemberCountInfoService hspMemberCountInfoService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(HspMemberCountInfo eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(hspMemberCountInfoService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(HspMemberCountInfo eo) {
        return new Payload(hspMemberCountInfoService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspMemberCountInfoService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改HspMemberCountInfo")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody HspMemberCountInfo eo) {
     eo.setId(pk);
     return new Payload(hspMemberCountInfoService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建HspMemberCountInfo", notes = "创建HspMemberCountInfo")
    public Payload create(@RequestBody HspMemberCountInfo eo) {
        return new Payload(hspMemberCountInfoService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除HspMemberCountInfo", notes = "根据id删除HspMemberCountInfo")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspMemberCountInfoService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除HspMemberCountInfo", notes = "根据id批量删除HspMemberCountInfo")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(hspMemberCountInfoService.delete(ids));
    }

}