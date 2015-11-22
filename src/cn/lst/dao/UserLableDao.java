package cn.lst.dao;

import java.util.List;

import cn.lst.entity.UserLable;

public interface UserLableDao {
	/* 添加标签 */
	public void save(UserLable lable);

	/* 更新标签 */
	public void update(UserLable lable);

	/* 删除标签 */
	public void delete(String name);

	/* 获得所有的标签 */
	public List<UserLable> getAll();
	
	/*通过名称获得*/
	public UserLable findByName(String name) ;
}
