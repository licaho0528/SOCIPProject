package cn.ekgc.socip.user.service.impl;

import cn.ekgc.socip.base.util.IdGenerator;
import cn.ekgc.socip.base.util.RedisUtil;
import cn.ekgc.socip.base.util.TokenUtil;
import cn.ekgc.socip.pojo.entity.user.User;
import cn.ekgc.socip.user.dao.UserDao;
import cn.ekgc.socip.user.service.UserService;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName <b>智慧公务车信息平台-用户信息传输层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 18:44
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Autowired
	private IdGenerator idGenerator;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>根据 Token 获取当前登录用户信息</b>
	 * @param [token]
	 * @return cn.ekgc.socip.pojo.entity.user.User
	 * @author admin
	 * @date 2021-03-04 18:35
	 */
	@Override
	public User getUserByToken(String token) throws Exception {
		// 校验用户的 Token 是否有效
		if (TokenUtil.verifyToken(token) != null) {
			//查询登录的用户信息
			return (User) redisUtil.getToRedis(token, User.class);
		}
		return null;
	}
}
