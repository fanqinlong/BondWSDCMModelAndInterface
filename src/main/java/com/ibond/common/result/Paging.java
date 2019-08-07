package com.ibond.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 分页工具类
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Paging<T> {
	private long total;
	private T list;

	public Paging() {
	}

	public Paging(long total, T list) {
		this.total = total;
		this.list = list;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public T getList() {
		return list;
	}

	public void setList(T list) {
		this.list = list;
	}
}