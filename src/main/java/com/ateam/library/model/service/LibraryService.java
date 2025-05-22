package com.ateam.library.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ateam.common.SqlSessionTemplate;
import com.ateam.library.model.dao.LibraryDAO;
import com.ateam.library.model.vo.Library;
import com.ateam.library.model.vo.LibrarySearchVO;

public class LibraryService {

	private LibraryDAO libDao;
	private SqlSession session;
	
	public int getTotalCount() {
		int totalCount = libDao.getTotalCount(session);
		return totalCount;
	}

	public LibraryService() {
		libDao = new LibraryDAO();
		session = SqlSessionTemplate.getSqlSession();
	}
	
	public List<Library> selectListAll(int currentPage) {
		List<Library> libList = libDao.selectList(session, currentPage);
		return libList;
	}

	public List<Library> selectSearchList(LibrarySearchVO search) {
		System.out.println("여기9999");
		List<Library> libList = libDao.selectSearchList(session, search);
		return libList;
	}

	public int insertLibrary(Library notice) {
		System.out.println("insertLibrary여기오냐userId?");
		int result = libDao.insertLibrary(session, notice);
		System.out.println("resilt여기오냐userId?"+result);
		return result;
	}
}
