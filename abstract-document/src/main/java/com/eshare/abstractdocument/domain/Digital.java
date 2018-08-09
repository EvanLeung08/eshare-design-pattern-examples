package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.AbstractGoods;

import java.util.Map;

/**
 * 数码产品
 *
 * @author liangyh
 * @date 2018/8/9
 */
public class Digital extends AbstractGoods implements HasType, HasBrand, HasPrice,HasWeight {

    public Digital(Map<String, Object> properties) {
        super(properties);
    }
}