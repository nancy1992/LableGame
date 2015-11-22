package cn.lst.service;

import java.util.List;

import cn.lst.dao.UserLableDao;
import cn.lst.entity.UserLable;

public class UserLableServiceImpl implements UserLableService {

	UserLableDao userLableDao;

	public void save(UserLable lable) {
		userLableDao.save(lable);
	}

	public void update(UserLable lable) {
		userLableDao.update(lable);
	}

	public void delete(String name) {
		userLableDao.delete(name);
	}

	public List<UserLable> getAll() {
		return userLableDao.getAll();
	}

	public UserLableDao getUserLableDao() {
		return userLableDao;
	}

	public void setUserLableDao(UserLableDao userLableDao) {
		this.userLableDao = userLableDao;
	}

	public UserLable findByName(String name) {
		return userLableDao.findByName(name);
	}

}
