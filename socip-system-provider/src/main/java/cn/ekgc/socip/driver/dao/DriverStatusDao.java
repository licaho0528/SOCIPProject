package cn.ekgc.socip.driver.dao;

import cn.ekgc.socip.pojo.entity.driver.DriverLicenseType;
import cn.ekgc.socip.pojo.entity.driver.DriverStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员状态数据持久层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 23:11
 * @Version 1.0
 */
@Repository
public interface DriverStatusDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param []
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.DriverLicenseType.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-03 18:59
	 */
	List<DriverStatus> findListByQuery(DriverStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:00
	 */
	boolean save(DriverStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:01
	 */
	boolean update(DriverStatus entity) throws  Exception;
}
