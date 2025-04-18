package com.example.demo.config;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class CopyUtil {
    // 单个对象拷贝
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) return null;
        T obj = null;
        try {
            // 使用getDeclaredConstructor()代替newInstance()
            obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(source, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    // 列表拷贝
    public static <T> List<T> copyList(List<?> sourceList, Class<T> clazz) {
        return sourceList.stream()
                .map(e -> copy(e, clazz))
                .collect(Collectors.toList());
    }
}
