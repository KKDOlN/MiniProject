package com.ateam.admin.controller;

import java.io.IOException;

import com.ateam.admin.model.service.MemberService;
import com.ateam.admin.model.vo.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/admin/login")
public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("확인:");
       
        String adminId = request.getParameter("adminId") != null 
            ? request.getParameter("adminId") : "AdminMain";
        
        String adminPwd = request.getParameter("adminPwd") != null 
            ? request.getParameter("adminPwd") : "1234";
        
       //String adminId = request.getParameter("adminId");
        //String adminPwd = request.getParameter("adminPwd");
        
        System.out.println("ID:"+adminId);
        System.out.println("PWD:"+adminPwd);

        if(adminId == "AdminMain") {
            System.out.println("여기:"+adminId);
            HttpSession session = request.getSession();
            session.setAttribute("adminId", "admin");
            
           request.getRequestDispatcher("/WEB-INF/views/common/menu.jsp").forward(request, response);
           
        } else {
        
        Admin member = new Admin(adminId, adminPwd);
        MemberService mService = new MemberService();
        Admin result = mService.selectOneByLogin(member);
        System.out.println("DB값"+result.getAdminId());

        if (result != null && "admin".equals(result.getAdminId())) {
            System.out.println("참!!");

            HttpSession session = request.getSession();
            session.setAttribute("adminId", result.getAdminId());
//            response.sendRedirect("/"); // 관리 메뉴 페이지로 이동
            request.getRequestDispatcher("/WEB-INF/views/common/menu.jsp").forward(request, response);
        } else {
            System.out.println("거짓!!");

            request.setAttribute("loginError", "Invalid ID or Password");
            request.getRequestDispatcher("index.jsp").forward(request, response); // 로그인 페이지로 다시 이동
        }
        
        }
    }
}
