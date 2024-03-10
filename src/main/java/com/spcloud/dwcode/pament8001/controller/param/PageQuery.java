package com.spcloud.dwcode.pament8001.controller.param;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@Schema(description = "查询分页信息")
public class PageQuery {
    private Integer pageNo = 1;
    private Integer pageSize = 10;
    private String sortBy;
    private Boolean isAsk = false;

    public <T> Page<T> getPage(){
        Page<T> page = Page.of(pageNo, pageSize);
        if (StringUtils.isNotBlank(sortBy)){
            if (isAsk){
                page.addOrder(OrderItem.ascs(sortBy));
            } else {
                page.addOrder(OrderItem.descs(sortBy));
            }
        }
        return page;
    }

    public <T> Page<T> getPageByOrders(OrderItem... orders){
        Page<T> page = Page.of(pageNo, pageSize);
        if (StringUtils.isNotBlank(sortBy)){
            if (isAsk) {
                page.addOrder(OrderItem.ascs(sortBy));
            } else {
                page.addOrder(OrderItem.descs(sortBy));
            }
        }
        for (OrderItem order : orders) {
            page.addOrder(order);
        }
        return page;
    }
}
