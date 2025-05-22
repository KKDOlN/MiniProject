package com.ateam.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ateam.member.model.service.MemberNoticeService;
import com.ateam.member.model.vo.MemberNotice;



/**
 * Servlet implementation class BookmodifyServlet
 */
@WebServlet("/member/modify")
public class MemberModifyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        int userNo = (request.getParameter("userNo") != null)
				? Integer.parseInt(request.getParameter("userNo")) : 0;
      
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        int age = (request.getParameter("userAge") != null)
				? Integer.parseInt(request.getParameter("userAge")) : 0;
        String addr = request.getParameter("addr");
      
        String gender = request.getParameter("gender");
        
        
        // 데이터베이스 업데이트 로직 구현
        // (실제 데이터베이스 연결 및 쿼리 실행 코드 필요)
        MemberNotice notice = new MemberNotice(userNo, userId, userName, age, addr, gender);
        MemberNoticeService nService = new MemberNoticeService();
		
        int result = nService.updateNotice(notice);

        // 업데이트 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/memberlist");
        
        
        // 데이터베이스에서 해당 bookNo의 도서 정보를 조회
        // 조회된 정보를 request에 setAttribute로 저장
        //request.getRequestDispatcher("/WEB-INF/views/booknotice/book-modify.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 폼에서 제출된 수정된 도서 정보를 받아옴
    	
    	
    	int userNo = (request.getParameter("userNo") != null)
				? Integer.parseInt(request.getParameter("userNo")) : 0;
      
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        int age = (request.getParameter("userAge") != null)
				? Integer.parseInt(request.getParameter("userAge")) : 0;
        String addr = request.getParameter("addr");
      
        String gender = request.getParameter("gender");

        
        // 데이터베이스 업데이트 로직 구현
        // (실제 데이터베이스 연결 및 쿼리 실행 코드 필요)
        MemberNotice notice = new MemberNotice(userNo, userId, userName, age, addr, gender);
        MemberNoticeService nService = new MemberNoticeService();
		
        int result = nService.updateNotice(notice);

        // 업데이트 후 도서 목록 페이지로 리다이렉트
        response.sendRedirect("/notice/memberlist");
    }
}
