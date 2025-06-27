package com.ezylang.evalex.util;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 集合相关工具类
 * <p>
 * 此工具方法针对{@link Collection}及其实现类封装的工具。
 * <p>
 *
 */
public class CollUtil {

	/**
	 * 新建一个HashSet
	 *
	 * @param <T> 集合元素类型
	 * @param ts  元素数组
	 * @return HashSet对象
	 */
	@SafeVarargs
	public static <T> HashSet<T> newHashSet(T... ts) {
		return set(false, ts);
	}
	/**
	 * 新建一个HashSet
	 *
	 * @param <T>      集合元素类型
	 * @param isSorted 是否有序，有序返回 {@link LinkedHashSet}，否则返回 {@link HashSet}
	 * @param ts       元素数组
	 * @return HashSet对象
	 */
	@SafeVarargs
	public static <T> HashSet<T> set(boolean isSorted, T... ts) {
		if (null == ts) {
			return isSorted ? new LinkedHashSet<>() : new HashSet<>();
		}
		int initialCapacity = Math.max((int) (ts.length / .75f) + 1, 16);
		final HashSet<T> set = isSorted ? new LinkedHashSet<>(initialCapacity) : new HashSet<>(initialCapacity);
		Collections.addAll(set, ts);
		return set;
	}
}
