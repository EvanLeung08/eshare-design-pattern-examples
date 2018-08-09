package com.eshare.abstractdocument;

import com.eshare.abstractdocument.domain.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 抽象文档示例
 *
 */
public class App
{

    public static void main( String[] args )
    {
        //创建电视属性
        Map<String,Object> televisionProperties = new HashMap<>();
        televisionProperties.put(HasType.TypeProperty,"电视");
        televisionProperties.put(HasPrice.PriceProperties,2000);
        televisionProperties.put(HasBrand.BrandProperties,"创维");
        televisionProperties.put(HasWeight.WeightProperties,50);

        //创建手机属性
        Map<String,Object> phoneProperties = new HashMap<>();
        phoneProperties.put(HasType.TypeProperty,"手机");
        phoneProperties.put(HasPrice.PriceProperties,1900);
        phoneProperties.put(HasBrand.BrandProperties,"小米");
        phoneProperties.put(HasWeight.WeightProperties,0.5);

        //创建平板属性
        Map<String,Object> padProperties = new HashMap<>();
        padProperties.put(HasType.TypeProperty,"平板");
        padProperties.put(HasPrice.PriceProperties,5000);
        padProperties.put(HasBrand.BrandProperties,"苹果");
        padProperties.put(HasWeight.WeightProperties,0.5);

        //创建数码产品属性
        Map<String,Object> digitalProperties = new HashMap<>();
        digitalProperties.put(HasCategory.CategoryProperties,Arrays.asList(televisionProperties,phoneProperties,padProperties));
        Digital digital = new Digital(digitalProperties);

        System.out.println(digital.toString());
    }
}