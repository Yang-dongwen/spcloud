package com.spcloud.dwcode.pament8001.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spcloud.dwcode.pament8001.controller.param.PageQuery;
import com.spcloud.dwcode.pament8001.controller.vo.PageVO;
import com.spcloud.dwcode.pament8001.entity.PayEntity;
import com.spcloud.dwcode.pament8001.entity.ResEntity;
import com.spcloud.dwcode.pament8001.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@Tag(name = "支付请求接口")
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;


    @PostMapping("/addPay")
    @Operation(summary = "添加支付信息")
    public ResEntity addPayInfo(@RequestBody PayEntity payInfo) {
        payInfo.setPayTime(new Date());
//        int i = 1/0;
        payService.save(payInfo);
        return ResEntity.success(payInfo);
    }
    @PostMapping("/editPay")
    @Operation(summary = "修改支付信息")
    public ResEntity editPayInfo(@RequestBody PayEntity payInfo) {
        payInfo.setPayTime(new Date());
        payService.updateById(payInfo);
        return ResEntity.success(payInfo);
    }

    @GetMapping("/getPay")
    @Operation(summary = "获取单个支付信息")
    public ResEntity getPayInfo(Long payId) {
        PayEntity payInfo = payService.getById(payId);
        if (payInfo == null) throw new RuntimeException("没有该支付信息.");
        return ResEntity.success(payInfo);
    }

    @PostMapping("/getPays")
    @Operation(summary = "分页获取支付信息")
    public ResEntity getPayInfo(@RequestBody PageQuery pageQuery) {
        Page<PayEntity> page = payService.page(pageQuery.getPage());
        PageVO<PayEntity> payEntityPageVO = PageVO.of(page.getTotal(), page.getPages(), page.getCurrent(), page.getRecords());
        return ResEntity.success(payEntityPageVO);
    }
    @GetMapping("/delPay")
    @Operation(summary = "删除支付信息")
    public ResEntity delPayInfo(Long payId) {
        payService.removeById(payId);
        return ResEntity.success();
    }
}
