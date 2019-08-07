package com.ibond.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 下拉刷新工具类
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Scrolling<T> {
	private boolean hasMore;
	private T list;

	public Scrolling() {
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public T getList() {
		return list;
	}

	public void setList(T list) {
		this.list = list;
	}
}