package com.ateam.booknotice.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ateam.booknotice.model.dao.BookNoticeDAO;
import com.ateam.booknotice.model.vo.BookNotice;
import com.ateam.booknotice.model.vo.BookSearchVO;
import com.ateam.common.SqlSessionTemplate;

public class BookNoticeService {
	
	private BookNoticeDAO nDao;
	private SqlSession session;
	
	public BookNoticeService() {
		nDao = new BookNoticeDAO();
		session = SqlSessionTemplate.getSqlSession();
	}

	public int insertNotice(BookNotice notice) {
		int result = nDao.insertNotice(session, notice);
		return result;
	}

	public int updateNotice(BookNotice notice ) {
		int result = nDao.updateNotice(session, notice);
		return result;
	}

	public int deleteNotice(int bookNo) {
		int result = nDao.deleteNotice(session, bookNo);
		return result;
	}

	public List<BookNotice> selectListAll(int currentPage) {
		List<BookNotice> nList = nDao.selectList(session, currentPage);
		return nList;
	}

	public BookNotice selectOneByNo(int bookNo) {
		BookNotice notice = nDao.selectOneByNo(session, bookNo);
		return notice;
	}

	public int getTotalCount() {
	    int totalCount = nDao.getTotalCount(session);
		return totalCount;
	}

	public List<BookNotice> selectSearchList(BookSearchVO search) {
		List<BookNotice> searchList = nDao.selectSearchList(session, search);
		return searchList;
	}

}
