package com.ezylang.evalex.util;

import java.util.AbstractMap;
import java.util.Map;

/**
 * Map相关工具类
 *
 */
public class MapUtil {

	/**
	 * 将键和值转换为{@link AbstractMap.SimpleImmutableEntry}<br>
	 * 返回的Entry不可变
	 *
	 * @param key   键
	 * @param value 值
	 * @param <K>   键类型
	 * @param <V>   值类型
	 * @return {@link AbstractMap.SimpleImmutableEntry}
	 * @since 5.8.0
	 */
	public static <K, V> Map.Entry<K, V> entry(K key, V value) {
		return entry(key, value, true);
	}

	/**
	 * 将键和值转换为{@link AbstractMap.SimpleEntry} 或者 {@link AbstractMap.SimpleImmutableEntry}
	 *
	 * @param key         键
	 * @param value       值
	 * @param <K>         键类型
	 * @param <V>         值类型
	 * @param isImmutable 是否不可变Entry
	 * @return {@link AbstractMap.SimpleEntry} 或者 {@link AbstractMap.SimpleImmutableEntry}
	 * @since 5.8.0
	 */
	public static <K, V> Map.Entry<K, V> entry(K key, V value, boolean isImmutable) {
		return isImmutable ?
				new AbstractMap.SimpleImmutableEntry<>(key, value) :
				new AbstractMap.SimpleEntry<>(key, value);
	}
}
