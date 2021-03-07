package cn.ekgc.socip.transport.driver;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.base.pojo.vo.QueryVO;
import cn.ekgc.socip.pojo.entity.driver.DriverLicenseType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶证类型信息传输层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 17:01
 * @Version 1.0
 */
@FeignClient(name = "socip-system-provider")
@RequestMapping("/driverlicensetype/transport")
public interface DriverLicenseTypeTransport {

	/**
	 * <b>根据查询对象查询分页信息</b>
	 * @param [queryVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 17:05
	 */

	@PostMapping("/page")
	PageVO<DriverLicenseType> getPageByQuery(@RequestBody QueryVO<DriverLicenseType> queryVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 17:08
	 */
	@PostMapping("/list")
	List<DriverLicenseType> findListByQuery(@RequestBody DriverLicenseType query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 17:09
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DriverLicenseType entity) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 17:10
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DriverLicenseType entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param [id]
	 * @return cn.ekgc.socip.pojo.entity.driver.DriverLicenseType
	 * @author admin
	 * @date 2021-03-04 17:11
	 */
	@PostMapping("/id")
	DriverLicenseType getById(@RequestParam String id) throws Exception;

}
