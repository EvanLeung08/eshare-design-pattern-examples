package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.AbstractGoods;

import java.util.Map;

/**
 * 商品类别
 *
 * @author liangyh
 * @date 2018/8/9
 */
public class Category extends AbstractGoods implements HasType, HasBrand, HasPrice,HasWeight {

    protected Category(Map<String, Object> properties) {
        super(properties);
    }
}