package cn.ekgc.socip.driver.dao;

import cn.ekgc.socip.pojo.entity.driver.Driver;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员信息数据持久层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 18:57
 * @Version 1.0
 */
@Repository
public interface DriverDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param []
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.Driver>
	 * @author admin
	 * @date 2021-03-03 18:59
	 */
	List<Driver> findListByQuery(Driver query) throws Exception;
	
	/**
	 * <b>保存信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:00
	 */
	boolean save(Driver entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:01
	 */
	boolean update(Driver entity) throws  Exception;
}
