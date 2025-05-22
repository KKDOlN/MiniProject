package com.ateam.booknotice.model.vo;

public class BookSearchVO {
	private String searchCondition;
	private String searchKeyword;
	private String searchBookcode;
	
	public BookSearchVO() {}
	
	public BookSearchVO(String searchCondition, String searchKeyword) {
		super();
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
		this.searchBookcode = searchBookcode;

	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}
	
	public String getSearchBookcode() {
		return searchKeyword;
	}

	@Override
	public String toString() {
		return "BookSearchVO [searchCondition=" + searchCondition + ", searchBookcode=" + searchBookcode + "]";
	}
	
	
}
