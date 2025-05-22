package com.ateam.library.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.ateam.library.model.vo.Library;
import com.ateam.library.model.vo.LibrarySearchVO;

public class LibraryDAO {
	
	public int insertLibrary(SqlSession session, Library notice) {
		int result = session.insert("LibraryMapper.insertLIBRARY", notice);
		return result;
	}

	public List<Library> selectList(SqlSession session, int currentPage) {
		int limit = 10;
		int offset = (currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<Library> libList = session.selectList("LibraryMapper.selectList", null, rowBounds);
		return libList;
	}
	
	public List<Library> selectSearchList(SqlSession session, LibrarySearchVO search) {
		int limit = 10;
		System.out.println("만세!!"+search.getSearchCondition());
		List<Library> libList = session.selectList("LibraryMapper.selectSearchList", search);
		System.out.println("만세만세만세!!"+libList.size());
		return libList;
	}

	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("LibraryMapper.getTotalCount");
		return totalCount;
	}


	
		
}
