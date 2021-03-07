package cn.ekgc.socip.user.transport;

import cn.ekgc.socip.pojo.entity.user.User;
import cn.ekgc.socip.transport.user.UserTransport;
import cn.ekgc.socip.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName <b>智慧公务车信息平台-用户信息传输层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 18:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/trans/system/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService service;

	/**
	 * <b>根据 Token 获取当前登录用户信息</b>
	 * @param [token]
	 * @return cn.ekgc.socip.pojo.entity.user.User
	 * @author admin
	 * @date 2021-03-04 18:35
	 */
	@PostMapping("/token")
	@Override
	public User getUserByToken(@RequestParam String token) throws Exception {
		return service.getUserByToken(token);
	}
}
