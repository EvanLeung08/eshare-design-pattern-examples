package com.eshare.abstractdocument;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 抽象商品类
 *
 * @author liangyh
 * @date 2018/8/9
 */
public class AbstractGoods implements Goods {

    private final Map<String, Object> properties;

    protected AbstractGoods(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "属性不能为空");
        this.properties = properties;
    }


    @Override
    public Object getProperties(String key) {
        return this.properties.get(key);
    }

    @Override
    public void putProperties(String key, Object value) {
        this.properties.put(key, value);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        Optional<List<Map<String, Object>>> any = Stream.of(getProperties(key)).filter(el -> el != null).map(el -> (List<Map<String, Object>>) el).findAny();
        return any.isPresent() ? any.get().stream().map(constructor) : Stream.empty();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this.properties);
    }
}