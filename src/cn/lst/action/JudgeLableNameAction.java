package cn.lst.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import cn.lst.entity.Lable;
import cn.lst.service.LableService;

import com.opensymphony.xwork2.ActionSupport;

public class JudgeLableNameAction extends ActionSupport {
	
	private static final long serialVersionUID = -8031229955084533771L;
	private LableService lableService;
	private String name;
	private InputStream inputStream;
	public String execute() throws Exception {
		Lable lable = lableService.findByName(name);
		if(lable!=null)
		{
			setInputStream(new ByteArrayInputStream("exists".getBytes("UTF-8")));
			return "exists";
		}else{
			setInputStream(new ByteArrayInputStream("ok".getBytes("UTF-8")));
			return SUCCESS;
		}
		
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
	
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
}
