package cn.lst.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.lst.entity.Lable;

public class LableDaoImpl extends HibernateDaoSupport implements LableDao {

	public void save(Lable lable) {
		this.getHibernateTemplate().save(lable);
		
	}

	public void update(Lable lable) {
		this.getHibernateTemplate().update(lable);
	}

	public void delete(String name) {
		this.getHibernateTemplate().delete(findByName(name));
	}

	@SuppressWarnings("unchecked")
	public List<Lable> getAll() {
		String queryString = "from Lable";
		List<Lable> list = this.getHibernateTemplate().find(queryString);
		return list;
	}

	@SuppressWarnings("unchecked")
	public Lable findByName(String name) {
		List<Lable> list = this.getHibernateTemplate().find("from Lable where lable = ?", name);
		if(0 != list.size()) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
