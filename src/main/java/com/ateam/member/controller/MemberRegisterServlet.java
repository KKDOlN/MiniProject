package com.ateam.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

import com.ateam.common.NavigationUtil;
import com.ateam.member.model.service.MemberNoticeService;
import com.ateam.member.model.vo.MemberNotice;


/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/member/register")
public class MemberRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기");
		request.getRequestDispatcher("/WEB-INF/views/member/member-register.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기2");
		System.out.println("여기2-1");
		String 	userId		= request.getParameter("userId");
		System.out.println("여기2-2");
		String 	userName 	= request.getParameter("userName");
		System.out.println("여기2-3");
		int 	userAge		= Integer.parseInt(request.getParameter("userAge"));
		System.out.println("여기2-4");
		String 	addr		= request.getParameter("addr");
		System.out.println("여기2-5");
		String 	gender		= request.getParameter("gender");
		System.out.println("여기3");
		MemberNotice member = new MemberNotice(userId, userName, userAge, addr, gender);
		int result = new MemberNoticeService().insertMember(member);
		System.out.println("여기4");
		if(result > 0) {
			System.out.println("여기5");
			response.sendRedirect("/notice/memberlist");
		}else {
			System.out.println("여기6");
			NavigationUtil.navigateToError(request, response, "500", "서비스처리가 완료되지 않았습니다.");
//			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp")
//			.forward(request, response);
		}
	}

}
