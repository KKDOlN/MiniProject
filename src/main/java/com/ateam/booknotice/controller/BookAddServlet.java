package com.ateam.booknotice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ateam.booknotice.model.service.BookNoticeService;
import com.ateam.booknotice.model.vo.BookNotice;

/**
 * Servlet implementation class BookAddServlet
 */
@WebServlet("/notice/insert")
public class BookAddServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // GET 요청 처리: 책 추가 폼을 보여줌
    	System.out.println("doGET여기오냐?");
        request.getRequestDispatcher("/WEB-INF/views/booknotice/book-add.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // POST 요청 처리: 새 책 정보를 데이터베이스에 추가
    	System.out.println("doPOST여기오냐?");
    	
    	
        // 폼에서 전송된 데이터 받기
        String bookName = request.getParameter("bookName");
        String bookWriter = request.getParameter("bookWriter");
        String genre = request.getParameter("genre");
        int bookPrice = Integer.parseInt(request.getParameter("bookPrice"));
        String publisher = request.getParameter("publisher");
        
        // 데이터베이스 연결 및 쿼리 실행 (예시 코드, 실제 구현 필요)
        BookNotice notice = new BookNotice(bookName, bookWriter, publisher, bookPrice, genre);
        BookNoticeService nService = new BookNoticeService();
		
        int result = nService.insertNotice(notice);
        
        // 도서 등록 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/booklist");
    }
    
}
