package com.ateam.member.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ateam.common.SqlSessionTemplate;
import com.ateam.member.model.dao.MemberNoticeDAO;
import com.ateam.member.model.vo.MemberNotice;
import com.ateam.member.model.vo.MemberSearchVO;


public class MemberNoticeService {
	
	private MemberNoticeDAO nDao;
	private SqlSession session;
	
	public MemberNoticeService() {
		nDao = new MemberNoticeDAO();
		session = SqlSessionTemplate.getSqlSession();
	}

	public int insertMember(MemberNotice notice) {
		int result = nDao.insertNotice(session, notice);
		return result;
	}

	public int updateNotice(MemberNotice notice) {
		int result = nDao.updateNotice(session, notice);
		return result;
	}

	public int deleteNotice(int userNo) {
		int result = nDao.deleteNotice(session, userNo);
		return result;
	}

	public List<MemberNotice> selectListAll(int currentPage) {
		List<MemberNotice> memList = nDao.selectList(session, currentPage);
		return memList;
	}

	public MemberNotice selectOneByNo(int userNo) {
		MemberNotice notice = nDao.selectOneByNo(session, userNo);
		return notice;
	}

	public int getTotalCount() {
	    int totalCount = nDao.getTotalCount(session);
		return totalCount;
	}

	public List<MemberNotice> selectSearchList(MemberSearchVO search) {
		List<MemberNotice> searchList = nDao.selectSearchList(session, search);
		return searchList;
	}

	

}
