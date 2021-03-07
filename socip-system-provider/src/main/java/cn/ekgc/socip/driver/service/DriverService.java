package cn.ekgc.socip.driver.service;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.pojo.entity.driver.Driver;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员功能业务层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:42
 * @Version 1.0
 */
public interface DriverService {
	/*
	 * <b>根据查询对象查询分页信息<b>
	 * @param [query, pageVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.Driver>
	 * @author admin
	 * @date 2021-03-04 15:44
	 */
	PageVO<Driver> getPageByQuery(Driver query, PageVO<Driver> pageVO) throws Exception;

	/**
	 * <b>根据对象查询列表信息</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.Driver>
	 * @author admin
	 * @date 2021-03-04 15:46
	 */
	List<Driver> getListByQuery(Driver query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:47
	 */
	boolean save(Driver entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:48
	 */
	boolean update(Driver entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param []
	 * @return cn.ekgc.socip.pojo.entity.driver.Driver
	 * @author admin
	 * @date 2021-03-04 15:49
	 */
	Driver getById(String id) throws Exception;
}
