package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.Goods;

import java.util.Optional;

/**
 * 类型
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface HasType extends Goods {

    String TypeProperty = "type";

    default Optional<String> getType(){
        return Optional.ofNullable((String)getProperties(TypeProperty));
    }
}