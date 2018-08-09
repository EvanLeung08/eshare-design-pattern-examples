package com.eshare.abstractdocument.domain;

import com.eshare.abstractdocument.Goods;

import java.util.stream.Stream;

/**
 * 包含类别
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface HasCategory extends Goods {

    String CategoryProperties = "category";

    default Stream getCategory(){
    return children(CategoryProperties,Category::new);
    }

}