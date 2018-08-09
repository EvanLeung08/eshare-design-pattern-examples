package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.Goods;

import java.util.Optional;

/**
 * 包含价格
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface HasPrice extends Goods {
    String PriceProperties = "price";
    default Optional<Number> getPrice(){
        return Optional.ofNullable((Number)getProperties(PriceProperties));
    }
}