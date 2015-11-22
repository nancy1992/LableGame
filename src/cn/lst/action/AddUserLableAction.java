package cn.lst.action;

import cn.lst.entity.UserLable;
import cn.lst.service.UserLableService;

import com.opensymphony.xwork2.ActionSupport;

public class AddUserLableAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1067012394225273821L;
	private UserLableService userLableService;
	private String name;

	public String execute() throws Exception {
		
		if (userLableService.findByName(name) == null){
			UserLable lable = new UserLable();
			lable.setLable(name);
			userLableService.save(lable);
		}
			
		return SUCCESS;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public UserLableService getUserLableService() {
		return userLableService;
	}


	public void setUserLableService(UserLableService userLableService) {
		this.userLableService = userLableService;
	}
}
