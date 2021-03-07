package cn.ekgc.socip.base.controller;

import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName <b>基础控制层类</b>
 * <p>
 *     基础控制类依赖注入了<b>HttpServletRequest</b>、<b>HttpServletResponse</b>和<b>HttpSession</b>，<br/>
 *     其他功能控制层类都必须<b>继承于</b>本基础控制层类
 * </p>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 18:24
 * @Version 1.0
 */
@Controller
public class BaseController {
	@Autowired
	public HttpServletRequest request;
	@Autowired
	public HttpServletResponse response;
	@Autowired
	public HttpSession session;
}
