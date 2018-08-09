package com.eshare.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 商品接口
 *
 * @author liangyh
 * @date 2018/8/9
 */
public interface Goods {


    Object getProperties(String key);

    void putProperties(String key,Object value);

    <T> Stream<T> children(String key , Function<Map<String,Object>,T> constructor);
}