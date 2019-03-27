package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.HspMemberShareInfoService;
import com.deepexi.pay.domain.eo.HspMemberShareInfo;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/hsp_member_share_info", description = "$desc")
@RestController
@RequestMapping("/api/v1/hspMemberShareInfos")
public class  HspMemberShareInfoController {

    @Autowired
    private HspMemberShareInfoService hspMemberShareInfoService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(HspMemberShareInfo eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(hspMemberShareInfoService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(HspMemberShareInfo eo) {
        return new Payload(hspMemberShareInfoService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspMemberShareInfoService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改HspMemberShareInfo")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody HspMemberShareInfo eo) {
     eo.setId(pk);
     return new Payload(hspMemberShareInfoService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建HspMemberShareInfo", notes = "创建HspMemberShareInfo")
    public Payload create(@RequestBody HspMemberShareInfo eo) {
        return new Payload(hspMemberShareInfoService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除HspMemberShareInfo", notes = "根据id删除HspMemberShareInfo")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspMemberShareInfoService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除HspMemberShareInfo", notes = "根据id批量删除HspMemberShareInfo")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(hspMemberShareInfoService.delete(ids));
    }

}