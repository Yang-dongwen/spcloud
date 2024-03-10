package com.spcloud.dwcode.pament8001.entity;

import com.spcloud.dwcode.pament8001.emun.ResCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class ResEntity<T> {

    private String code;

    private String msg;

    private T Data;

    private long timeStamp;

    public ResEntity() {
        this.timeStamp = System.currentTimeMillis();
    }

    public static <T> ResEntity<T> success(){
        return success(null);
    }
    public static <T> ResEntity<T> success(T data){
        ResCodeEnum resCode = ResCodeEnum.getResCode("200");
        return new ResEntity().setCode(resCode.getCode()).setMsg(resCode.getMsg()).setData(data);
    }

    public static ResEntity fail(String msg){
        return new ResEntity().setCode("500").setMsg(msg);
    }
}
