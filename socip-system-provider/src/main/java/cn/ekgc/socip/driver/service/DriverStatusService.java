package cn.ekgc.socip.driver.service;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.pojo.entity.driver.DriverStatus;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员状态功能业务层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:43
 * @Version 1.0
 */
public interface DriverStatusService {

	/*
	 * <b>根据查询对象查询分页信息<b>
	 * @param [query, pageVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.DriverStatus>
	 * @author admin
	 * @date 2021-03-04 15:44
	 */
	PageVO<DriverStatus> getPageByQuery(DriverStatus query, PageVO<DriverStatus> pageVO) throws Exception;

	/**
	 * <b>根据对象查询列表信息</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.DriverStatus>
	 * @author admin
	 * @date 2021-03-04 15:46
	 */
	List<DriverStatus> getListByQuery(DriverStatus query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:47
	 */
	boolean save(DriverStatus entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:48
	 */
	boolean update(DriverStatus entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param []
	 * @return cn.ekgc.socip.pojo.entity.driver.DriverStatus
	 * @author admin
	 * @date 2021-03-04 15:49
	 */
	DriverStatus getById(String id) throws Exception;
}
