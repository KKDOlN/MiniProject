package com.ateam.member.model.vo;

public class MemberSearchVO {
	private String searchCondition;
	private String searchKeyword;
	private String searchUserId;
	
	public MemberSearchVO() {}

	public MemberSearchVO(String searchCondition, String searchKeyword, String searchUserId) {
		super();
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
		this.searchUserId = searchUserId;
	}
	
	public MemberSearchVO(String searchCondition, String searchKeyword) {
		super();
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}
	
	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public String getSearchUserId() {
		return searchUserId;
	}

	@Override
	public String toString() {
		return "MemberSearchVO [searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword
				+ ", searchUserId=" + searchUserId + "]";
	}
	
}
