package com.like.product.VO;

import lombok.Data;

/**
 * Created by like
 * 2018/5/26
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体内容
     */
    private T data;
}
