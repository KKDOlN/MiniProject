package com.ateam.library.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ateam.library.model.service.LibraryService;
import com.ateam.library.model.vo.Library;
import com.ateam.library.model.vo.LibrarySearchVO;


/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/notice/librarysearch")
public class LibrarySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibrarySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("여기");
	LibraryService nService = new LibraryService();
		String searchCondition = request.getParameter("searchCondition");
		System.out.println("여기1"+searchCondition);
		String searchKeyword = request.getParameter("searchKeyword");
		System.out.println("여기2"+searchKeyword);
		// 1. 2개의 값을 담을 VO를 만들기
		LibrarySearchVO search = new LibrarySearchVO(searchCondition, searchKeyword);
		System.out.println("여기3"+nService.getTotalCount());
		// 2. HashMap을 이용하기
		List<Library> searchList = nService.selectSearchList(search);
		
		
		if(searchList != null && !searchList.isEmpty()) {
			int totalCount = nService.getTotalCount();
			int boardLimit = 10;
			int maxPage = (int)Math.ceil((double)totalCount/boardLimit);
			int currentPage = request.getParameter("currentPage") != null 
						? Integer.parseInt(request.getParameter("currentPage")) : 1;
			// 성공하면 검색결과 페이지로 이동
			int naviCountPerPage = 5;
			int startNavi = (currentPage-1)/naviCountPerPage*naviCountPerPage+1;
			int endNavi = (startNavi-1) + naviCountPerPage;
			System.out.println("여기4:"+totalCount);
			if(endNavi > maxPage) {
				endNavi = maxPage;
			}
			request.setAttribute("searchList", searchList);
			request.setAttribute("startNavi", startNavi);
			request.setAttribute("endNavi", endNavi);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("searchKeyword", searchKeyword);
			request.setAttribute("searchCondition", searchCondition);
			request.getRequestDispatcher("/WEB-INF/views/library/librarysearch.jsp")
			.forward(request, response);
			System.out.println("여기5");
		}else {
			System.out.println("여기6");
			// 실패하면 에러페이지로 이동
			com.ateam.common.NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("여기7");
		doGet(request, response);
	}

}
