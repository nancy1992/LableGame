package cn.lst.action;

import java.util.List;

import cn.lst.entity.UserLable;
import cn.lst.service.UserLableService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllUserLableAction extends ActionSupport {
	
	private static final long serialVersionUID = -5047467924307611918L;
	private UserLableService userLableService;

	public String execute() throws Exception {
		List<UserLable> userLableList = userLableService.getAll();
		ActionContext context = ActionContext.getContext();
		context.put("userLables", userLableList);
		return SUCCESS;
	}

	public UserLableService getUserLableService() {
		return userLableService;
	}

	public void setUserLableService(UserLableService userLableService) {
		this.userLableService = userLableService;
	}

}
