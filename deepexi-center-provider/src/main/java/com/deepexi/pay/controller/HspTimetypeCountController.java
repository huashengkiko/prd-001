package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.HspTimetypeCountService;
import com.deepexi.pay.domain.eo.HspTimetypeCount;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/hsp_timetype_count", description = "$desc")
@RestController
@RequestMapping("/api/v1/hspTimetypeCounts")
public class  HspTimetypeCountController {

    @Autowired
    private HspTimetypeCountService hspTimetypeCountService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(HspTimetypeCount eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(hspTimetypeCountService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(HspTimetypeCount eo) {
        return new Payload(hspTimetypeCountService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspTimetypeCountService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改HspTimetypeCount")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody HspTimetypeCount eo) {
     eo.setId(pk);
     return new Payload(hspTimetypeCountService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建HspTimetypeCount", notes = "创建HspTimetypeCount")
    public Payload create(@RequestBody HspTimetypeCount eo) {
        return new Payload(hspTimetypeCountService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除HspTimetypeCount", notes = "根据id删除HspTimetypeCount")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspTimetypeCountService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除HspTimetypeCount", notes = "根据id批量删除HspTimetypeCount")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(hspTimetypeCountService.delete(ids));
    }

}