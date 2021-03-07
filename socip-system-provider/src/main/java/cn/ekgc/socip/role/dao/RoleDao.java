package cn.ekgc.socip.role.dao;

import cn.ekgc.socip.pojo.entity.user.Role;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-角色信息数据持久层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 15:34
 * @Version 1.0
 */
public interface RoleDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param []
	 * @return
	 * @author admin
	 * @date 2021-03-03 18:59
	 */
	List<Role> findListByQuery(Role query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:00
	 */
	boolean save(Role entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param [entity]
	 * @return boolean
	 * @author admin
	 * @date 2021-03-03 19:01
	 */
	boolean update(Role entity) throws  Exception;
}
