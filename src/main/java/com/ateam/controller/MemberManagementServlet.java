package com.ateam.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/MemberManagementServlet")
public class MemberManagementServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("<h1>회원 관리 페이지</h1>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li><a href='#'>회원 전체 조회</a></li>");
        response.getWriter().println("<li><a href='#'>회원 추가하기</a></li>");
        response.getWriter().println("<li><a href='#'>회원 삭제하기</a></li>");
        response.getWriter().println("<li><a href='menu.jsp'>메인 메뉴로 이동</a></li>");
        response.getWriter().println("</ul>");
    }
}
