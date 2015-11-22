package cn.lst.action;

import cn.lst.entity.Lable;
import cn.lst.service.LableService;

import com.opensymphony.xwork2.ActionSupport;

public class AddLableAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7404629278480134412L;
	private LableService lableService;
	private String name;

	public String execute() throws Exception {
		
		if (lableService.findByName(name) == null){
			Lable lable = new Lable();
			lable.setLable(name);
			lableService.save(lable);
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
}
