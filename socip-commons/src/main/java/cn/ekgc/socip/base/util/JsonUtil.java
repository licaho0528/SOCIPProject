package cn.ekgc.socip.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import jdk.internal.dynalink.beans.StaticClass;

/**
 * @ClassName Json 格式数据转换工具类
 * @Description
 * @Author Admin
 * @Date 2021-03-02 18:59
 * @Version 1.0
 */
public class JsonUtil {
	
	/**
	 * <b> 将对象转换为 Json 格式数据 </b>
	 * @param obj
	 * @return java.lang.String
	 * @author admin
	 * @date 2021-03-02 19:02
	 */
	public static String parseToJson(Object obj){
		//创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}

	/**
	 * 将  Json 类型数据转换为对象
	 * @param [json, argCls]
	 * @return java.lang.Object
	 * @author admin
	 * @date 2021-03-02 19:05
	 */
	public static Object parseToObject(String json, Class argCls){
		//创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argCls);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
