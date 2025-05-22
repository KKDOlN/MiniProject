package com.ateam.booknotice.model.vo;



public class BookNotice {
	private int bookNo;
	private String bookName;
	private String bookWriter;
	private String publisher;
	private String genre;
	private int bookPrice;
	
	
	public BookNotice() {}

	public BookNotice(int bookNo) {
		super();
		this.bookNo = bookNo;
	}
	
	public BookNotice(int bookNo, String bookName, String bookWriter) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
	}

	

	public BookNotice(String bookName, String bookWriter, String publisher) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
	}
	
	public BookNotice(int bookNo, String bookName, String bookWriter, String publisher, int bookPrice, String genre) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
		this.genre = genre;
	}
	
	public BookNotice(String bookName, String bookWriter, String publisher, int bookPrice, String genre) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
		this.genre = genre;
	}

	public int getBookNo() {
		return bookNo;
	}



	public String getBookName() {
		return bookName;
	}



	public String getBookWriter() {
		return bookWriter;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public String getPublisher() {
		return publisher;
	}



	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "BookNotice [bookNo=" + bookNo + ", bookName=" + bookName + ", bookWriter=" + bookWriter + ", bookPrice="
				+ bookPrice + ", publisher=" + publisher + ", genre=" + genre + "]";
	}
	
	
	
}
