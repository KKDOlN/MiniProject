package com.ateam.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.ateam.common.NavigationUtil;
import com.ateam.member.model.service.MemberNoticeService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberNoticeService nService = new MemberNoticeService();
		int userNo = (request.getParameter("userNo") != null)
						? Integer.parseInt(request.getParameter("userNo")) : 0;
		int result = nService.deleteNotice(userNo);
		if(result > 0) {
			// 성공시 목록 페이지로 이동
			response.sendRedirect("/notice/memberlist");
		}else {
			// 실패시 에러페이지로 이동
			NavigationUtil.navigateToError(request, response, "500", "서비스가 완료되지 않았습니다.");
		}
	}

}
