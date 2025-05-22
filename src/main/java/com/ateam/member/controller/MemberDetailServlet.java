package com.ateam.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.ateam.common.NavigationUtil;
import com.ateam.member.model.service.MemberNoticeService;
import com.ateam.member.model.vo.MemberNotice;


@WebServlet("/notice/memberdetail")
public class MemberDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberDetailServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberNoticeService nService = new MemberNoticeService();
		int userNo = (request.getParameter("userNo") != null)
				? Integer.parseInt(request.getParameter("userNo")) : 1;
		MemberNotice notice = nService.selectOneByNo(userNo);
		
		System.out.println("북넘버:"+request.getParameter("userNo"));
		
		if(notice != null) {
		request.setAttribute("notice", notice);
			request.getRequestDispatcher("/WEB-INF/views/member/memberdetail.jsp")
			.forward(request, response);
		}else {
			NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
	}

}
