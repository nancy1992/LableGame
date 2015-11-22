package cn.lst.action;

import java.util.List;

import cn.lst.entity.Lable;
import cn.lst.service.LableService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetLableAction extends ActionSupport{

	private static final long serialVersionUID = 7404629278480134412L;
	
	private LableService lableService;
	public String execute() throws Exception {
		List<Lable> userLableList = lableService.getAll();
		ActionContext context = ActionContext.getContext();
		context.put("lables", userLableList);
		return SUCCESS;
	}
	public LableService getLableService() {
		return lableService;
	}
	public void setLableService(LableService lableService) {
		this.lableService = lableService;
	}
	
}
