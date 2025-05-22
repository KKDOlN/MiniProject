package com.ateam.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.ateam.booknotice.model.vo.BookNotice;
import com.ateam.booknotice.model.vo.BookSearchVO;
import com.ateam.member.model.vo.MemberNotice;
import com.ateam.member.model.vo.MemberSearchVO;


public class MemberNoticeDAO {

	public int insertNotice(SqlSession session, MemberNotice notice) {
		int result = session.insert("MemberNoticeMapper.insertMemberNotice", notice);
		return result;
	}

	public int updateNotice(SqlSession session, MemberNotice notice) {
		int result = session.update("MemberNoticeMapper.updateMemberNotice", notice);
		return result;
	}

	public int deleteNotice(SqlSession session, int noticeNo) {
		int result = session.delete("MemberNoticeMapper.deleteMemberNotice", noticeNo);
		return result;
	}

	public List<MemberNotice> selectList(SqlSession session, int currentPage) {
		int limit = 10;
		int offset = (currentPage-1)*limit; // 첫시작의 -1값(ex 1부터면 0)
		// currentPage가 1이면 offset은 0
		// currentPage가 2이면 offset은 10
		// currentPage가 3이면 offset은 20
		RowBounds rowBounds = new RowBounds(offset, limit);
		//List<BookNotice> memList = session.selectList("MemberNoticeMapper.selectList");
		List<MemberNotice> memList = session.selectList("MemberNoticeMapper.selectList", null, rowBounds);
		return memList;
	}

	public MemberNotice selectOneByNo(SqlSession session, int userNo) {
		MemberNotice notice = session.selectOne("MemberNoticeMapper.selectOneByNo", userNo);
		return notice;
	}

	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("MemberNoticeMapper.getTotalCount");
		//int totalCount = 1;
		return totalCount;
	}

	public List<MemberNotice> selectSearchList(SqlSession session, MemberSearchVO search) {
		List<MemberNotice> searchList = session.selectList("MemberNoticeMapper.selectSearchList", search);
		return searchList;
	}

}
