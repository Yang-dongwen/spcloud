package com.spcloud.dwcode.pament8001.emun;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
public enum ResCodeEnum {
    RC200("200", "请求成功"),
    RC300("300", "请求重定向"),
    RC400("400", "页面未找到"),
    RC500("500", "服务器报错"),
    RC999("999", "未知错误");

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ResCodeEnum getResCode(String code){
       return Arrays.stream(ResCodeEnum.values()).filter(x -> x.code.equalsIgnoreCase(code)).findFirst().get();
    }
}
