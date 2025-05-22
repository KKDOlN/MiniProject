package com.ateam.member.model.vo;

import java.sql.Date;

public class MemberNotice {
	private int userNo;
	private String userId;
	private String userName;
	private int userAge;
	private String addr;
	private String gender;
	private Date enrolldate;
	
	public MemberNotice() {}

	public MemberNotice(int userNo, String userId, String userName) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
	}

	public MemberNotice(String userId, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}
	public MemberNotice(String userId, String userName, int userAge, String addr, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.addr = addr;
		this.gender = gender;
		
	}
	
	

	public MemberNotice(int userNo, String userId, String userName, int userAge, String addr, String gender) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.addr = addr;
		this.gender = gender;
	}

	public int getUserNo() {
		return userNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public String getAddr() {
		return addr;
	}

	public String getGender() {
		return gender;
	}

	public Date getEnrolldate() {
		return enrolldate;
	}

	@Override
	public String toString() {
		return "MemberNotice [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", userAge="
				+ userAge + ", addr=" + addr + ", gender=" + gender + ", enrolldate=" + enrolldate + "]";
	}
}
