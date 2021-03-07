package cn.ekgc.socip.driver.service.impl;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import cn.ekgc.socip.base.util.IdGenerator;
import cn.ekgc.socip.base.util.PageUtil;
import cn.ekgc.socip.driver.dao.DriverStatusDao;
import cn.ekgc.socip.driver.service.DriverStatusService;
import cn.ekgc.socip.pojo.entity.driver.DriverStatus;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员状态功能业务层接口实现类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:54
 * @Version 1.0
 */
@Service
@Transactional
public class DriverStatusServiceImpl implements DriverStatusService {
	@Autowired
	private DriverStatusDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/*
	 * <b>根据查询对象查询分页信息<b>
	 * @param [query, pageVO]
	 * @return cn.ekgc.socip.base.pojo.vo.PageVO<cn.ekgc.socip.pojo.entity.driver.DriverStatus>
	 * @author admin
	 * @date 2021-03-04 15:44
	 */
	@Override
	public PageVO<DriverStatus> getPageByQuery(DriverStatus query, PageVO<DriverStatus> pageVO) throws Exception {

		// 开启 PageHelPer 分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		List<DriverStatus> list = dao.findListByQuery(query);
		new PageUtil<DriverStatus>().parseFromPageInfoToPageVO(list, pageVO);

		return pageVO;
	}

	/**
	 * <b>根据对象查询列表信息</b>
	 * @param [query]
	 * @return java.util.List<cn.ekgc.socip.pojo.entity.driver.DriverStatus>
	 * @author admin
	 * @date 2021-03-04 15:46
	 */
	@Override
	public List<DriverStatus> getListByQuery(DriverStatus query) throws Exception {
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
	public boolean save(DriverStatus entity) throws Exception {
		// 生成主键并注入到对象
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
	public boolean update(DriverStatus entity) throws Exception {
		return dao.update(entity);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param [id]
	 * @return cn.ekgc.socip.pojo.entity.driver.DriverStatus
	 * @author admin
	 * @date 2021-03-04 15:49
	 */
	@Override
	public DriverStatus getById(String id) throws Exception {
		//封装查询对象并进行列表查询
		List<DriverStatus> list = dao.findListByQuery(new DriverStatus(id));
		if (list != null && list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}
