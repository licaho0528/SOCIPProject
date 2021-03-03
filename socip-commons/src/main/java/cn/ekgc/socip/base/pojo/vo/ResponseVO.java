package cn.ekgc.socip.base.pojo.vo;

import cn.ekgc.socip.base.pojo.enums.ResponseCodeEnum;
import com.sun.org.apache.xml.internal.serializer.SerializerTrace;

import java.io.Serializable;

/**
 * @ClassName  * <b>系统响应视图信息</b>
 * <p>
 *     本视图包含：<b>响应码 code</b>和<b>响应数据 data</b>。<br/>
 *     所有异步返回前端数据都必须以本响应视图返回
 * </p>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 21:57
 * @Version 1.0
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -3511817003089108023L;
	private Integer code;                  //编码
	private E data;                        //响应数据

	private ResponseVO(Integer code) {
		this.code = code;
	}

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	/**
	 * <b>系统响应成功视图</b>
	 */
	public static ResponseVO getSuccessResponse(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_SUCCESS.getCode());
	}

	/**
	 * <b>系统响应成功视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccessResponse(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_SUCCESS.getCode(),data);
	}

	/**
	 * <b>系统响应未认证视图</b>
	 */
	public static ResponseVO getUnAuthResponse(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_UNNAUTH.getCode(),"该用户未认证");
	}

	/**
	 * <b>系统响应异常视图</b>
	 */
	public static ResponseVO getExceptionResponse(Exception e){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_EXCEPTION.getCode(),e);
	}

	/**
	 * <b>系统响错误常视图</b>
	 */
	public static ResponseVO getErrorResponse(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_ERROR.getCode(),data);
	}
}
