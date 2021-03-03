package cn.ekgc.socip.base.pojo.enums;

/**
 * @ClassName <b>系统状态枚举信息</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 21:38
 * @Version 1.0
 */
public enum StatusEnum {
	STATUS_ENABLE(SystemEnumConstants.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(SystemEnumConstants.STATUS_DISABLE,"禁用")
	;
	private Integer code;                      //编码
	private String remark;                     //说明

	private StatusEnum(Integer code, String remark) {
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
