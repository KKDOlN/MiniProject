package com.ateam.booknotice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ateam.booknotice.model.service.BookNoticeService;
import com.ateam.common.NavigationUtil;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/book/delete")
public class BookDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookNoticeService nService = new BookNoticeService();
		int bookNo = (request.getParameter("bookNo") != null)
						? Integer.parseInt(request.getParameter("bookNo")) : 0;
		int result = nService.deleteNotice(bookNo);
		if(result > 0) {
			// 성공시 목록 페이지로 이동
			response.sendRedirect("/notice/booklist");
		}else {
			// 실패시 에러페이지로 이동
			NavigationUtil.navigateToError(request, response, "500", "서비스가 완료되지 않았습니다.");
		}
	}

}
