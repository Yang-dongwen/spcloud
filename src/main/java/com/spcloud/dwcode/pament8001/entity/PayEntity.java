package com.spcloud.dwcode.pament8001.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@TableName("pay")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PayEntity {

    @TableId(type = IdType.AUTO)
    private Long payId;

    private String payDesc;

    private BigDecimal payAmount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date payTime;

    private Long payUser;
}
