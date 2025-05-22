package com.ateam.admin.model.service;

import org.apache.ibatis.session.SqlSession;

import com.ateam.admin.model.dao.MemberDAO;
import com.ateam.admin.model.vo.Admin;
import com.ateam.common.JDBCTemplate;
import com.ateam.common.SqlSessionTemplate;


public class MemberService {
	private JDBCTemplate jdbcTemplate;
	private SqlSession conn;
	private MemberDAO mDao;
	
	public MemberService() {
		conn = SqlSessionTemplate.getSqlSession();
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}

	public Admin selectOneByLogin(Admin admin) {
		Admin result = mDao.selectOneByLogin(conn, admin);
		return result;
	}
}
