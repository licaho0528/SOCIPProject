package cn.ekgc.socip.user.service;

import cn.ekgc.socip.pojo.entity.user.User;

/**
 * @ClassName <b>智慧公务车信息平台-用户信息业务层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 18:43
 * @Version 1.0
 */
public interface UserService {

	/**
	 * <b>根据 Token 获取当前登录用户信息</b>
	 * @param [token]
	 * @return cn.ekgc.socip.pojo.entity.user.User
	 * @author admin
	 * @date 2021-03-04 18:35
	 */
	User getUserByToken(String token) throws Exception;
}
