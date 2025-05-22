package com.ateam.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ateam.common.NavigationUtil;
import com.ateam.member.model.service.MemberNoticeService;
import com.ateam.member.model.vo.MemberNotice;


/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/notice/memberlist")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberNoticeService nService = new MemberNoticeService();
		
		// endNavi의 최대값이 전체 게시물에 따라서 달라질 수 잇음
		// ex) 전체 게시물의 갯수가 232개이고 1페이지당 10개씩 보여준다고하면
		// endNavi 최대값은 24가 됨 -> 이것을 식으로 써서 전체게시물이 변경될때마다 달라지도록 해야함.
		
		int totalCount = nService.getTotalCount();  // 원래는 232
		int boardLimit = 10;
		
		//int maxPage = (int)Math.ceil((double)totalCount/boardLimit);
		int maxPage = 10;
//		int maxPage = (totalCount % boardLimit > 0) 
//						? totalCount / boardLimit + 1 
//								: totalCount/ boardLimit;
//		if(totalCount % boardLimit > 0) {
//			maxPage = totalCount / boardLimit + 1;
//		}else {
//			maxPage = totalCount / boardLimit;
//		}
		
		int currentPage = request.getParameter("currentPage") != null 
					? Integer.parseInt(request.getParameter("currentPage")) : 1;
		List<MemberNotice> memList = nService.selectListAll(currentPage);
		if(memList.size() > 0) {
			// currentPage: 1 ~ 5, startNavi: 1, endNavi: 5 = 5*1
			// currentPage: 6 ~ 10, startNavi: 6, endNavi: 10 = 5*2
			// currentPage: 11 ~ 15, startNavi: 11, endNavi: 15 = 5*3
			int naviCountPerPage = 5;
			int startNavi = (currentPage-1)/naviCountPerPage*naviCountPerPage+1;
			int endNavi = (startNavi-1) + naviCountPerPage;
			//endNavi = memList.size()/10+1;
			//if(endNavi > maxPage) {
			//	endNavi = maxPage;
			//}
			
			if(endNavi > memList.size()/10+1) {
				endNavi = memList.size()/10+1;
			}

			
			
			request.setAttribute("memList", memList);
			request.setAttribute("startNavi", startNavi);
			request.setAttribute("endNavi", endNavi);
			request.setAttribute("maxPage", maxPage);
			
			request.getRequestDispatcher("/WEB-INF/views/member/memberlist.jsp")
			.forward(request, response);
		}else {
			NavigationUtil.navigateToError(request, response, "404", "데이터가 존재하지 않습니다.");
		}
		
	}
		
}

