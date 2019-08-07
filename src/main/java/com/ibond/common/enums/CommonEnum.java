package com.ibond.common.enums;


import com.ibond.common.exception.BaseErrorInfoInterface;

/**
 * 
 * @Title: CommonEnum
 * @Description: 公用描述枚举类
 * @Version:1.0.0
 * @author simonfan
 */
public enum CommonEnum implements BaseErrorInfoInterface {
	FAILURE(-1, "失败!"),
	// 数据操作错误定义
	SUCCESS(1, "成功!"),




	//风控模块
	RiskOpponentPutInStorageFailure(800001, "销售对手入库失败!"),
	RiskOpponentOutOfStorageFailure(800002, "销售对手出库失败!"),
	RiskOpponentAdjustStorageFailure(800003, "销售对手调整失败!"),
	RiskOpponentOrgExist(800004, "机构已入库!"),
	RiskOpponentOrgNoExist(800005, "机构不在库!"),
	RiskOpponentNoDirection(800006, "系统未查到相同状态!"),
	RiskOpponentNoGrade(800007, "系统未查到相同级别!"),
	RiskOpponentDepositoryFlowIsNull(800008, "销售对手库申请单不能为空!"),
	RiskOpponentOrgIsNull(800009, "机构信息为空!"),

	RiskCreditPutInStorageFailure(800101, "信用风险入库失败!"),
	RiskCreditOutOfStorageFailure(800102, "信用风险出库失败!"),
	RiskCreditAdjustStorageFailure(800103, "信用风险调整失败!"),
	RiskCreditIssuerExist(800104, "发行人已入库!"),
	RiskCreditIssuerNoExist(800105, "发行人不在库!"),
	RiskCreditNoDirection(800106, "系统未查到相同状态!"),
	RiskCreditNoGrade(800107, "系统未查到相同级别!"),
	RiskCreditRiskFlowIsNull(800108, "销售对手库申请单不能为空!"),
	RiskCreditIssuerIsNull(800109, "发行人信息为空!"),

	//DCM模块
	DCMAddBookScheduleFailure(900001, "簿记日程新增失败!"),
	DCMUpdateBookScheduleFailure(800002, "簿记日程修改失败!"),
	DCMDeleteBookScheduleFailure(800003, "簿记日程删除失败!"),
	DCMBookScheduleExist(800004, "簿记日程同名记录已存在!"),
	DCMBookScheduleNoExist(800005, "簿记日程记录不存在!")

	;

	/** 错误码 */
	private int code;

	/** 错误描述 */
	private String msg;

	CommonEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}

}
