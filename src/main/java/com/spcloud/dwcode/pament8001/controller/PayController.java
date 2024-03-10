package com.spcloud.dwcode.pament8001.controller;

import com.spcloud.dwcode.pament8001.entity.PayEntity;
import com.spcloud.dwcode.pament8001.entity.ResEntity;
import com.spcloud.dwcode.pament8001.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
