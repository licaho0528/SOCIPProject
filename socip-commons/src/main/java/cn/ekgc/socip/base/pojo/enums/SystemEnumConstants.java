package cn.ekgc.socip.base.pojo.enums;

import cn.ekgc.socip.base.util.BaseConstantUtil;

import java.util.Properties;

/**
 * @ClassName <b>系统枚举信息</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 19:14
 * @Version 1.0
 */
public class SystemEnumConstants {
	private static Properties properties = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 props/base/base.properties
			properties.load(BaseConstantUtil.class.getClassLoader().getResourceAsStream("props/base/enums.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 *<b>系统状态枚举信息： 启用状态</b>
	 */
	static final Integer STATUS_ENABLE = Integer.parseInt(properties.getProperty("enum.status.enable"));

	/**
	 *<b>系统状态枚举信息： 禁用状态</b>
	 */
	static final Integer STATUS_DISABLE = Integer.parseInt(properties.getProperty("enum.status.disable"));

	/**
	 *<b>系统响应码信息： 用户未认证</b>
	 */
	static final Integer RESPONSE_UNNAUTH = Integer.parseInt(properties.getProperty("enum.response.unnauth"));

	/**
	 *<b>系统响应码信息： 系统处理响应成功</b>
	 */
	static final Integer RESPONSE_SUCCESS = Integer.parseInt(properties.getProperty("enum.response.success"));

	/**
	 *<b>系统响应码信息： 系统处理响应异常</b>
	 */
	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(properties.getProperty("enum.response.exception"));

	/**
	 *<b>系统响应码信息： 系统处理响应错误</b>
	 */
	static final Integer RESPONSE_ERROR = Integer.parseInt(properties.getProperty("enum.response.error"));

}
