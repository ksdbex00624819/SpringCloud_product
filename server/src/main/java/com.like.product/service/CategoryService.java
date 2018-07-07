package com.like.product.service;

import com.like.product.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by like
 * 2018/5/26
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
