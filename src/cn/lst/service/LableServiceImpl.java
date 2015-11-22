package cn.lst.service;

import java.util.List;

import cn.lst.dao.LableDao;
import cn.lst.entity.Lable;

public class LableServiceImpl implements LableService {

	LableDao lableDao;

	public void save(Lable lable) {
		lableDao.save(lable);
	}

	public void update(Lable lable) {
		lableDao.update(lable);
	}

	public void delete(String name) {
		lableDao.delete(name);
	}

	public List<Lable> getAll() {
		return lableDao.getAll();
	}

	public Lable findByName(String name) {
		return lableDao.findByName(name);
	}

	public LableDao getLableDao() {
		return lableDao;
	}

	public void setLableDao(LableDao lableDao) {
		this.lableDao = lableDao;
	}
}
