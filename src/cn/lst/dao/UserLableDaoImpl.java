package cn.lst.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.lst.entity.UserLable;

public class UserLableDaoImpl extends HibernateDaoSupport implements UserLableDao {

	public void save(UserLable lable) {
		this.getHibernateTemplate().save(lable);
		
	}

	public void update(UserLable lable) {
		this.getHibernateTemplate().update(lable);
	}

	public void delete(String name) {
		this.getHibernateTemplate().delete(findByName(name));
	}

	@SuppressWarnings("unchecked")
	public List<UserLable> getAll() {
		String queryString = "from UserLable";
		List<UserLable> list = this.getHibernateTemplate().find(queryString);
		return list;
	}

	@SuppressWarnings("unchecked")
	public UserLable findByName(String name) {
		List<UserLable> list = this.getHibernateTemplate().find("from UserLable where lable = ?", name);
		if(0 != list.size()) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
