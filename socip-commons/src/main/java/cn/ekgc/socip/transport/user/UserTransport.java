package cn.ekgc.socip.transport.user;

import cn.ekgc.socip.pojo.entity.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName <b>智慧公务车信息平台-用户信息传输层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 18:31
 * @Version 1.0
 */
@FeignClient(name = "socip-system-provider")
@RequestMapping("/trans/system/user")
public interface UserTransport {
	/**
	 * <b>根据 Token 获取当前登录用户信息</b>
	 * @param [token]
	 * @return cn.ekgc.socip.pojo.entity.user.User
	 * @author admin
	 * @date 2021-03-04 18:35
	 */
	@PostMapping("/token")
	User getUserByToken(@RequestParam String token) throws Exception;
}
