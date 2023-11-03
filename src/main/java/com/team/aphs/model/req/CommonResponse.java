package com.team.aphs.model.req;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 泛型响应数据
     */
    private T data;

    /**
     * 不需要 data 的返回
     */
    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}