package com.ateam.admin.model.vo;

public class Admin {
    private String adminId;
    private String adminPwd;

    public Admin () {}
    
    public Admin(String adminId,String adminPwd) {
    	super();
    	this.adminId = adminId;
    	this.adminPwd = adminPwd;
    }
	public String getAdminId() {
		return adminId;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPwd=" + adminPwd + "]";
	}
   
    
}
