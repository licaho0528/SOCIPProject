package cn.ekgc.socip.driver.service.impl;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.base.util.IdGenerator;
import cn.ekgc.socip.base.util.PageUtil;
import cn.ekgc.socip.driver.dao.DriverLicenseTypeDao;
import cn.ekgc.socip.driver.service.DriverLicenseTypeService;
import cn.ekgc.socip.pojo.entity.driver.DriverLicenseType;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶证类型功能业务层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:53
 * @Version 1.0
 */
@Service
@Transactional
public class DriverLicenseTypeServiceImpl implements DriverLicenseTypeService {
	@Autowired
	private DriverLicenseTypeDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/*
	 * <b>根据查询对象查询分页信息<b>
	 * @param [query, pageVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 15:44
	 */
	@Override
	public PageVO<DriverLicenseType> getPageByQuery(DriverLicenseType query, PageVO<DriverLicenseType> pageVO) throws Exception {

		// 开启 PageHelper 分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<DriverLicenseType> list = dao.findListByQuery(query);
		new PageUtil<DriverLicenseType>().parseFromPageInfoToPageVO(list, pageVO);

		return pageVO;
	}

	/**
	 * <b>根据对象查询列表信息</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.DriverLicenseType>
	 * @author admin
	 * @date 2021-03-04 15:46
	 */
	@Override
	public List<DriverLicenseType> getListByQuery(DriverLicenseType query) throws Exception {
		return dao.findListByQuery(query);
	}

	/**
	 * <b>保存对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:47
	 */
	@Override
	public boolean save(DriverLicenseType entity) throws Exception {
		//生成主键并注入保存对象中
		entity.setId(idGenerator.createId());
		return dao.save(entity);
	}

	/**
	 * <b>修改对象信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-04 15:48
	 */
	@Override
	public boolean update(DriverLicenseType entity) throws Exception {
		return dao.update(entity);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param []
	 * @return cn.ekgc.socip.pojo.entity.driver.DriverLicenseType
	 * @author admin
	 * @date 2021-03-04 15:49
	 */
	@Override
	public DriverLicenseType getById(String id) throws Exception {
		//封装查询对象并查询列表
		List<DriverLicenseType> list = dao.findListByQuery(new DriverLicenseType(id));
		if (list != null && list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
