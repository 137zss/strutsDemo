package com.zhiyou.struts2demo.action;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String userid;
	private String pwd;

	public String getUserid() {
		return userid;
	}

	
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	/** 参数校验 */
	public void validate() {
		// 验证非空
		if(userid == null || "".equals(userid.trim()) ){
			// 添加错误信息
			super.addFieldError("userid", "用户名不能为空");
		}
	} 
	
	public String execute() throws Exception {
		        if (getUserid().equals("zss") && getPwd().equals("123")) {
		           //  ActionContext.getContext().getSession().put("user", getUserid());
		            return SUCCESS;
		         }else{
		        	 super.addActionError("用户名或密码错误");
		            return ERROR;
		         }
		     }

}
