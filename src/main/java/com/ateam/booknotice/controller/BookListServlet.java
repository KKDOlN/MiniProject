package com.ateam.booknotice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ateam.booknotice.model.service.BookNoticeService;
import com.ateam.booknotice.model.vo.BookNotice;
import com.ateam.common.NavigationUtil;


@WebServlet("/notice/booklist")
public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BookListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookNoticeService nService = new BookNoticeService();
		
		int totalCount = nService.getTotalCount();  // 원래는 232
		int boardLimit = 10;
		int maxPage = 10;
		int currentPage = request.getParameter("currentPage") != null 
					? Integer.parseInt(request.getParameter("currentPage")) : 1;
		List<BookNotice> nList = nService.selectListAll(currentPage);
		if(nList.size() > 0) {
			int naviCountPerPage = 5;
			int startNavi = (currentPage-1)/naviCountPerPage*naviCountPerPage+1;
			int endNavi = (startNavi-1) + naviCountPerPage;
				if(endNavi > nList.size()/10+1) {
					endNavi = nList.size()/10+1;
				}			
			request.setAttribute("nList", nList);
			request.setAttribute("startNavi", startNavi);
			request.setAttribute("endNavi", endNavi);
			request.setAttribute("maxPage", maxPage);
			request.getRequestDispatcher("/WEB-INF/views/booknotice/booklist.jsp")
			.forward(request, response);
		}else {
			NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
		
	}
		
}

