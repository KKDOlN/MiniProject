package com.ateam.admin.model.dao;



import org.apache.ibatis.session.SqlSession;

import com.ateam.admin.model.vo.Admin;



public class MemberDAO {
	public Admin selectOneByLogin(SqlSession conn, Admin admin) {
		Admin result = conn.selectOne("AdminMapper.selectOneByLogin", admin);
		return result;
	}
}
