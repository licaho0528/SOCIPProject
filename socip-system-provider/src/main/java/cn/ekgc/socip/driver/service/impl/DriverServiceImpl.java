package cn.ekgc.socip.driver.service.impl;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.driver.service.DriverService;
import cn.ekgc.socip.pojo.entity.driver.Driver;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName b>智慧公务车信息平台-驾驶员功能业务层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:51
 * @Version 1.0
 */
@Service
@Transactional
public class DriverServiceImpl implements DriverService {
	@Override
	public PageVO<Driver> getPageByQuery(Driver query, PageVO<Driver> pageVO) throws Exception {
		return null;
	}

	@Override
	public List<Driver> getListByQuery(Driver query) throws Exception {
		return null;
	}

	@Override
	public boolean save(Driver entity) throws Exception {
		return false;
	}

	@Override
	public boolean update(Driver entity) throws Exception {
		return false;
	}

	@Override
	public Driver getById(String id) throws Exception {
		return null;
	}
}
