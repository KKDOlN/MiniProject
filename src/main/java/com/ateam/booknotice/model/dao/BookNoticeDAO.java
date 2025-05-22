package com.ateam.booknotice.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.ateam.booknotice.model.vo.BookNotice;
import com.ateam.booknotice.model.vo.BookSearchVO;

public class BookNoticeDAO {

	public int insertNotice(SqlSession session, BookNotice notice) {
		int result = session.insert("BookNoticeMapper.insertBookNotice", notice);
		return result;
	}
	

		
	public int updateNotice(SqlSession session, BookNotice notice) {
		int result = session.update("BookNoticeMapper.updateBookNotice", notice);
		return result;
	}

	public int deleteNotice(SqlSession session, int noticeNo) {
		int result = session.delete("BookNoticeMapper.deleteBookNotice", noticeNo);
		return result;
	}

	public List<BookNotice> selectList(SqlSession session, int currentPage) {
		int limit = 10;
		int offset = (currentPage-1)*limit; // 첫시작의 -1값(ex 1부터면 0)
		// currentPage가 1이면 offset은 0
		// currentPage가 2이면 offset은 10
		// currentPage가 3이면 offset은 20
		RowBounds rowBounds = new RowBounds(offset, limit);
		//List<BookNotice> nList = session.selectList("BookNoticeMapper.selectList");
		List<BookNotice> nList = session.selectList("BookNoticeMapper.selectList", null, rowBounds);
		return nList;
	}

	public BookNotice selectOneByNo(SqlSession session, int bookNo) {
		BookNotice notice = session.selectOne("BookNoticeMapper.selectOneByNo", bookNo);
		return notice;
	}

	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("BookNoticeMapper.getTotalCount");
		//int totalCount = 1;
		return totalCount;
	}

	public List<BookNotice> selectSearchList(SqlSession session, BookSearchVO search) {
		List<BookNotice> searchList = session.selectList("BookNoticeMapper.selectSearchList", search);
		return searchList;
	}

}
