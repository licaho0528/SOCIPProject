package cn.ekgc.socip.base.util;

import cn.ekgc.socip.base.pojo.vo.PageVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName <b>智慧公务车信息平台-分页工具类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 22:33
 * @Version 1.0
 */
public class PageUtil<E> {
	public void parseFromPageInfoToPageVO(List<E> list, PageVO<E> pageVO) {

		//创建一个 PageInfo 对象
		PageInfo<E> pageInfo = new PageInfo<>(list);

		//从 PageInfo 中提取数据
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());

	}
}
