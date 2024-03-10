package com.spcloud.dwcode.pament8001.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title = "支付实体信息")
public class PayEntity {

    @TableId(type = IdType.AUTO)
    @Schema(name = "支付id")
    private Long payId;
    @Schema(name = "支付描述")
    private String payDesc;
    @Schema(name = "支付金额")
    private BigDecimal payAmount;
    @Schema(name = "支付时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date payTime;
    @Schema(name = "支付用户")
    private Long payUser;
}
