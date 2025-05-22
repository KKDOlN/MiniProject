package com.ateam.library.model.vo;

public class LibrarySearchVO {
	private String searchCondition;
	private String searchKeyword;
	private String searchUserId;
	private String searchBookName;
	private int searchBookNo
	
	
	;
	
	public LibrarySearchVO() {}
	
	public LibrarySearchVO(String searchCondition, String searchKeyword) {
		super();
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;

	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public String getsearchUserId() {
		return searchUserId;
	}
	
	public String getsearchBookName() {
		return searchBookName;
	}
	
	public int getsearchBookNo() {
		return searchBookNo;
	}

	@Override
	public String toString() {
		return "LibrarySearchVO [searchCondition=" + searchCondition + ", searchBookName=" + searchBookName + "]";
	}
	
	
}
