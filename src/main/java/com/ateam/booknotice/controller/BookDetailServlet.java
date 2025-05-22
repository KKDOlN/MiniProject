package com.ateam.booknotice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ateam.booknotice.model.service.BookNoticeService;
import com.ateam.booknotice.model.vo.BookNotice;
import com.ateam.common.NavigationUtil;


@WebServlet("/notice/bookdetail")
public class BookDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookDetailServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookNoticeService nService = new BookNoticeService();
		int bookNo = (request.getParameter("bookNo") != null)
				? Integer.parseInt(request.getParameter("bookNo")) : 1;
		BookNotice notice = nService.selectOneByNo(bookNo);
		
		System.out.println("북넘버:"+request.getParameter("bookNo"));
		
		if(notice != null) {
		request.setAttribute("notice", notice);
			request.getRequestDispatcher("/WEB-INF/views/booknotice/bookdetail.jsp")
			.forward(request, response);
		}else {
			NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
	}

}
