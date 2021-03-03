package cn.ekgc.socip.base.util;

import java.util.Properties;

/**
 * @ClassName <b>基础信息常量工具类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 18:49
 * @Version 1.0
 */
public class BaseConstantUtil {
	private static Properties properties = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 props/base/base.properties
			properties.load(BaseConstantUtil.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统秘钥信息</b>
	 */
	public static final String SECRET_KEY = properties.getProperty("base.secret.key");

	/**
	 * <b>系统过期时间</b>
	 */
	public static final Integer EXPIRE_MINUTE = Integer.parseInt(properties.getProperty("base.expire.minute"));

}
