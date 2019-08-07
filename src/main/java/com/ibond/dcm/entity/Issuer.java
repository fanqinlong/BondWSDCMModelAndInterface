package com.ibond.dcm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "发行机构")
public class Issuer {
	@ApiModelProperty(value = "主键ID", required = true)
	private String id;
	@ApiModelProperty(value = "简称", example = "类型string 必填")
	private String name;
	@ApiModelProperty(value = "全称", example = "类型string 必填")
	private String fullName;

	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
