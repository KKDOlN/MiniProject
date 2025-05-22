package com.ateam.library.controller;

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

import com.ateam.library.model.service.LibraryService;
import com.ateam.library.model.vo.Library;



/**
 * Servlet implementation class BookAddServlet
 */
@WebServlet("/notice/libraryadd")
public class LibraryAddServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // GET 요청 처리: 대여 추가 폼을 보여줌
    	System.out.println("doGET여기오냐?");
        request.getRequestDispatcher("/WEB-INF/views/library/libraryadd.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // POST 요청 처리: 새 책 정보를 데이터베이스에 추가
    	System.out.println("doPOST여기오냐?"+request.getParameter("leaseNo"));
    	
    	
        // 폼에서 전송된 데이터 받기
        int leaseNo = Integer.parseInt(request.getParameter("leaseNo"));
        int bookNo = Integer.parseInt(request.getParameter("bookNo"));
        String userId = request.getParameter("userId");
        
        System.out.println("doPOST여기오냐userId?"+userId);
    	
        
        // 데이터베이스 연결 및 쿼리 실행 (예시 코드, 실제 구현 필요)
        Library notice = new Library(leaseNo, bookNo, userId);
        LibraryService nService = new LibraryService();
		
        int result = nService.insertLibrary(notice);
        
        // 도서 등록 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/library");
    }
    
}
