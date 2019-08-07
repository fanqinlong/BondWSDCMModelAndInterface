package com.ibond.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibond.common.enums.CommonEnum;

@JsonInclude(JsonInclude.Include.ALWAYS)
public class Result<T> {
	private int code;
	private String msg;
	private T data;

	private Result() {
	}

	public static<T> Result<T> builder(){
		return new Result<T>();
	}

	public Result<T> code(int code){
		this.code = code;
		return this;
	}

	public Result<T> msg(String msg){
		this.msg = msg;
		return this;
	}

	public Result<T> data(T data){
		this.data = data;
		return this;
	}

    public Result<T> success(CommonEnum commonEnum){
        this.code = commonEnum.getCode();
        this.msg = commonEnum.getMsg();
        return this;
    }

	public Result<T> build() {
		Result<T> result = new Result<T>();
		result.code = this.code;
		result.msg = this.msg;
		result.data = this.data;
		return result;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}
}