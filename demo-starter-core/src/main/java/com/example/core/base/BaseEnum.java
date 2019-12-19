package com.example.core.base;

/**
 * 基础枚举接口
 * Created by CGJ on 2019/12/19.
 */
public interface BaseEnum<K, V> {

    /**
     * 获取编码
     *
     * @return 编码
     */
    K code();

    /**
     * 获取描述
     *
     * @return 描述
     */
    V desc();
}
