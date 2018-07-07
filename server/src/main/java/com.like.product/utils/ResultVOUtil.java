package com.like.product.utils;

import com.like.product.VO.ResultVO;

/**
 * Created by like
 * 2018/5/26
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
