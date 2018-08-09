package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.Goods;

import java.util.Optional;

/**
 * 包含品牌
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface HasBrand extends Goods {
    String BrandProperties = "brand";

    default Optional<String> getBrand() {
        return Optional.ofNullable((String) getProperties(BrandProperties));
    }
}