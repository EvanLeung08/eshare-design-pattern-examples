package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.Goods;

import java.util.Optional;

/**
 * 包含重量
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface HasWeight extends Goods {
    String WeightProperties = "weight";

    default Optional<Number> getWeight() {
        return Optional.ofNullable((Number) getProperties(WeightProperties));
    }
}