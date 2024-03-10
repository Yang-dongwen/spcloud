package com.spcloud.dwcode.pament8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spcloud.dwcode.pament8001.dao.PayMapper;
import com.spcloud.dwcode.pament8001.entity.PayEntity;
import com.spcloud.dwcode.pament8001.service.PayService;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, PayEntity> implements PayService {
}
