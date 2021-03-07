package cn.ekgc.socip.driver.transport;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.base.pojo.vo.QueryVO;
import cn.ekgc.socip.driver.service.DriverLicenseTypeService;
import cn.ekgc.socip.pojo.entity.driver.DriverLicenseType;
import cn.ekgc.socip.transport.driver.DriverLicenseTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶证类型功能业传输层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 16:53
 * @Version 1.0
 */
@RestController
@RequestMapping("/driverlicensetype/transport")
public class DriverLicenseTypeTransportImpl implements DriverLicenseTypeTransport {
	@Autowired
	private DriverLicenseTypeService service;

	/**
	 * <b>根据查询对象查询分页信息</b>
	 * @param [queryVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 17:05
	 */
	@PostMapping("/page")
	@Override
	public PageVO<DriverLicenseType> getPageByQuery(@RequestBody QueryVO<DriverLicenseType> queryVO) throws Exception {
		return service.getPageByQuery(queryVO.getQuery(), queryVO.getPageVO());
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 17:08
	 */
	@PostMapping("/list")
	@Override
	public List<DriverLicenseType> findListByQuery(@RequestBody DriverLicenseType query) throws Exception {
		return service.getListByQuery(query);
	}

	/**
	 * <b>保存对象</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 17:09
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody DriverLicenseType entity) throws Exception {
		return service.save(entity);
	}

	/**
	 * <b>修改对象</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 17:10
	 */
	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody DriverLicenseType entity) throws Exception {
		return service.update(entity);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param [id]
	 * @return cn.ekgc.socip.pojo.entity.driver.DriverLicenseType
	 * @author admin
	 * @date 2021-03-04 17:11
	 */
	@PostMapping("/id")
	@Override
	public DriverLicenseType getById(@RequestParam String id) throws Exception {
		return service.getById(id);
	}
}
