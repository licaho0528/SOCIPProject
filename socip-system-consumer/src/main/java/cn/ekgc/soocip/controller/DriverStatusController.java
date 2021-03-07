package cn.ekgc.soocip.controller;

import cn.ekgc.socip.base.controller.BaseController;
import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.base.pojo.vo.QueryVO;
import cn.ekgc.socip.base.pojo.vo.ResponseVO;
import cn.ekgc.socip.base.util.StringUtil;
import cn.ekgc.socip.pojo.entity.driver.DriverStatus;
import cn.ekgc.socip.pojo.entity.user.User;
import cn.ekgc.socip.transport.driver.DriverStatusTransport;
import cn.ekgc.socip.transport.user.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员状态功能请求控制层</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 18:01
 * @Version 1.0
 */
@RequestMapping("/driverstatus")
@RestController
public class DriverStatusController extends BaseController {
	@Autowired
	private DriverStatusTransport statusTransport;
	@Autowired
	private UserTransport userTransport;

	/**
	 * <b>根据查询对象分页查询</b>
	 *
	 * @param [query, pageNum, pageSize]
	 * @return cn.ekgc.socip.base.pojo.vo.ResponseVO
	 * @author admin
	 * @date 2021-03-04 19:34
	 */
	@PostMapping("/paga/{pageNum}/{pageSize}")
	public ResponseVO getPageByQuery(@RequestBody DriverStatus query,
	                                 @PathVariable("pageNum") Integer pageNum,
	                                 @PathVariable("pageSize") Integer pageSize) throws Exception {
		// 获得前端在请求时 存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获取登录用户信息
			User longinUser = userTransport.getUserByToken(token);
			if (longinUser != null) {

				// 用户已登录 封装查询对象
				PageVO<DriverStatus> pageVO = new PageVO<DriverStatus>(pageNum, pageSize);
				//创建查询视图
				QueryVO<DriverStatus> queryVO = new QueryVO<DriverStatus>(query, pageVO);
				// 进行分页查询并返回
				return ResponseVO.getSuccessResponse(statusTransport.getPageByQuery(queryVO));

			}
		}
		//用户未登录
		return ResponseVO.getUnAuthResponse();
	}

	/**
	 * <b>根据对象查询列表</b>
	 *
	 * @param []
	 * @return cn.ekgc.socip.base.pojo.vo.ResponseVO
	 * @author admin
	 * @date 2021-03-05 16:24
	 */
	@PostMapping("/list")
	public ResponseVO getListByQuery(@RequestBody DriverStatus query) throws Exception {
		// 获得前端在请求时 存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		if (StringUtil.isNotNull(request.getHeader("Authorization"))) {
			User loginUser = userTransport.getUserByToken(request.getHeader("Authorization"));
			if (loginUser != null) {
				//用户已经登录
				return ResponseVO.getSuccessResponse(statusTransport.findListByQuery(query));
			}
		}
		//用户未登录
		return ResponseVO.getUnAuthResponse();
	}

	@PostMapping("/save")
	public ResponseVO save(@RequestBody DriverStatus entity) throws Exception {
		//判断用户登录状态
		if (StringUtil.isNotNull(request.getHeader("Authorization"))) {
			User loginUser = userTransport.getUserByToken(request.getHeader("Authorization"));
			//判断用户是否登录
			if (loginUser != null) {
				//判断用户提交信息的有效性
				if (StringUtil.isNotNull(entity.getCode()) && StringUtil.isNotNull(entity.getText())) {
					//效验 Code 是否重复
					DriverStatus query = new DriverStatus();
					query.setText(entity.getCode());
					if (statusTransport.findListByQuery(query) == null &&
							statusTransport.findListByQuery(query).isEmpty()) {
						// Code 可用注入数据
						entity.setCreateUser(loginUser.getId());
						//进行保存
						if (statusTransport.save(entity)) {
							return ResponseVO.getSuccessResponse();
						} else {
							return ResponseVO.getErrorResponse("保存失败");
						}

					} else {
						return ResponseVO.getErrorResponse("编码已被使用");
					}
				} else {
					return ResponseVO.getErrorResponse("提交相关信息无效");
				}
			}
		}
		//用户未登录
		return ResponseVO.getUnAuthResponse();
	}

	/**
	 * <b>修改信息</b>
	 * @param []
	 * @return cn.ekgc.socip.base.pojo.vo.ResponseVO
	 * @author admin
	 * @date 2021-03-05 17:37
	 */
	public ResponseVO update(@RequestBody DriverStatus entity) throws Exception{
		//判断用户登录状态
		if (StringUtil.isNotNull(request.getHeader("Authorization"))) {
			User loginUser = userTransport.getUserByToken(request.getHeader("Authorization"));
			//判断用户是否登录
			if (loginUser != null) {
				//判断用户提交信息的有效性
				if (StringUtil.isNotNull(entity.getCode()) && StringUtil.isNotNull(entity.getText())) {
					//效验 Code 是否重复
					DriverStatus query = new DriverStatus();
					query.setText(entity.getCode());
					if (statusTransport.findListByQuery(query) == null &&
							statusTransport.findListByQuery(query).isEmpty() ||
							statusTransport.findListByQuery(query).get(0).getId().equals(entity.getId())){
						// Code 可用注入数据
						entity.setUpdateUser(loginUser.getId());
						//进行保存
						if (statusTransport.save(entity)) {
							return ResponseVO.getSuccessResponse();
						} else {
							return ResponseVO.getErrorResponse("保存失败");
						}
					} else {
						return ResponseVO.getErrorResponse("编码已被使用");
					}
				} else {
					return ResponseVO.getErrorResponse("提交相关信息无效");
				}
			}
		}
		//用户未登录
		return ResponseVO.getUnAuthResponse();
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param [id]
	 * @return cn.ekgc.socip.base.pojo.vo.ResponseVO
	 * @author admin
	 * @date 2021-03-05 17:55
	 */
	@GetMapping("/id/{id}")
	public ResponseVO getById(@RequestParam String id) throws Exception{
		//判断用户登录状态
		if (StringUtil.isNotNull(request.getHeader("Authorization"))) {
			//根据 Token 获得用户信息
			User loginUser = userTransport.getUserByToken(request.getHeader("Authorization"));
			if (loginUser != null) {
				return ResponseVO.getSuccessResponse(statusTransport.getById(id));
			}
		}

		//用户未登录
		return ResponseVO.getUnAuthResponse();
	}
	
	
}
