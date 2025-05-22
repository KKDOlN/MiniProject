package com.ateam.library.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ateam.common.NavigationUtil;
import com.ateam.library.model.service.LibraryService;
import com.ateam.library.model.vo.Library;



@WebServlet("/notice/library")
public class LibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LibraryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibraryService libService = new LibraryService();
		
		int totalCount = libService.getTotalCount();  // 원래는 232
		int boardLimit = 10;
	
		int maxPage = 10;

		
		int currentPage = request.getParameter("currentPage") != null 
					? Integer.parseInt(request.getParameter("currentPage")) : 1;
		List<Library> libList = libService.selectListAll(currentPage);
		
		System.out.println("DB조회:"+libList.size());
		
		if(libList.size() > 0) {
			int naviCountPerPage = 5;
			int startNavi = (currentPage-1)/naviCountPerPage*naviCountPerPage+1;
			int endNavi = (startNavi-1) + naviCountPerPage;			
			
				if(endNavi > libList.size()/10+1) {
					endNavi = libList.size()/10+1;
				}			
			request.setAttribute("libList", libList);
			request.setAttribute("startNavi", startNavi);
			request.setAttribute("endNavi", endNavi);
			request.setAttribute("maxPage", maxPage);			
			request.getRequestDispatcher("/WEB-INF/views/library/librarylist.jsp")
			.forward(request, response);
		}else {
			NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
		
	}
		

}
