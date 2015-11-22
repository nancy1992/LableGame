package cn.lst.action;

import cn.lst.service.LableService;
import cn.lst.service.UserLableService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteLableAction extends ActionSupport {

	private static final long serialVersionUID = -7834985043833892269L;
	private LableService lableService;
	private UserLableService userLableService;
	private String name;

	public String execute() throws Exception {
		
		if (lableService.findByName(name) != null){
			lableService.delete(name);
			userLableService.delete(name);
		}
			
		return SUCCESS;
	}

	public LableService getLableService() {
		return lableService;
	}

	public void setLableService(LableService lableService) {
		this.lableService = lableService;
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
