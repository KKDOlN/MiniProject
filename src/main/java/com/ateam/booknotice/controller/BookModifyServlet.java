package com.ateam.booknotice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ateam.booknotice.model.service.BookNoticeService;
import com.ateam.booknotice.model.vo.BookNotice;

/**
 * Servlet implementation class BookmodifyServlet
 */
@WebServlet("/book/modify")
public class BookModifyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        int bookNo = (request.getParameter("bookNo") != null)
				? Integer.parseInt(request.getParameter("bookNo")) : 0;
      
        String bookName = request.getParameter("bookName");
        String bookWriter = request.getParameter("bookWriter");
        String genre = request.getParameter("genre");
        int bookPrice = (request.getParameter("bookPrice") != null)
				? Integer.parseInt(request.getParameter("bookPrice")) : 0;
      
        String publisher = request.getParameter("publisher");
        
    

        
        // 데이터베이스 업데이트 로직 구현
        // (실제 데이터베이스 연결 및 쿼리 실행 코드 필요)
        BookNotice notice = new BookNotice(bookNo, bookName, bookWriter, publisher, bookPrice, genre);
        BookNoticeService nService = new BookNoticeService();
		
        int result = nService.updateNotice(notice);

        // 업데이트 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/booklist");
        
        
        // 데이터베이스에서 해당 bookNo의 도서 정보를 조회
        // 조회된 정보를 request에 setAttribute로 저장
        //request.getRequestDispatcher("/WEB-INF/views/booknotice/book-modify.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 폼에서 제출된 수정된 도서 정보를 받아옴
    	
    	
    	int bookNo = (request.getParameter("bookNo") != null)
				? Integer.parseInt(request.getParameter("bookNo")) : 0;
    	//System.out.println("여기bookno:"+request.getParameter("bookNo"));
    	  //System.out.println("여기!!bookno:"+bookNo);
    	  
        String bookName = request.getParameter("bookName");
        //System.out.println("여기!!bookname:"+request.getParameter("bookName"));
        
        String bookWriter = request.getParameter("bookWriter");
        String genre = request.getParameter("genre");
        int bookPrice = (request.getParameter("bookPrice") != null)
				? Integer.parseInt(request.getParameter("bookPrice")) : 0;
      
        String publisher = request.getParameter("publisher");

        
        // 데이터베이스 업데이트 로직 구현
        // (실제 데이터베이스 연결 및 쿼리 실행 코드 필요)
        BookNotice notice = new BookNotice(bookNo, bookName, bookWriter, publisher, bookPrice, genre);
        BookNoticeService nService = new BookNoticeService();
		
        int result = nService.updateNotice(notice);

        // 업데이트 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/booklist");
    }
}
