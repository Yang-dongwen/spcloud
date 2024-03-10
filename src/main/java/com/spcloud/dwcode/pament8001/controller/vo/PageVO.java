package com.spcloud.dwcode.pament8001.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "of")
public class PageVO<T> {
    private Long total;

    private Long pages;

    private Long current;

    private List<T> list;
}
