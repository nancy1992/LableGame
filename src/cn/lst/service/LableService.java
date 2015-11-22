package cn.lst.service;

import java.util.List;

import cn.lst.entity.Lable;

public interface LableService {
	/* 添加标签 */
	public void save(Lable lable);

	/* 更新标签 */
	public void update(Lable lable);

	/* 删除标签 */
	public void delete(String name);

	/* 获得所有的标签 */
	public List<Lable> getAll();
	
	/*通过名称获得*/
	public Lable findByName(String name) ;
}
