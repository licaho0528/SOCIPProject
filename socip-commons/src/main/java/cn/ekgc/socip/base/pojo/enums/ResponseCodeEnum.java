package cn.ekgc.socip.base.pojo.enums;

/**
 * @ClassName <b>系统响应码枚举信息</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 18:39
 * @Version 1.0
 */
public enum  ResponseCodeEnum {
	RESPONSE_SUCCESS(SystemEnumConstants.RESPONSE_SUCCESS,"系统响应成功 "),
	RESPONSE_UNNAUTH(SystemEnumConstants.RESPONSE_UNNAUTH,"用户未登录"),
	RESPONSE_EXCEPTION(SystemEnumConstants.RESPONSE_EXCEPTION,"系统响应异常"),
	RESPONSE_ERROR(SystemEnumConstants.RESPONSE_ERROR,"系统响应错误")
		;
	private Integer code;                      //编码
	private String remark;                     //说明

	private ResponseCodeEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
