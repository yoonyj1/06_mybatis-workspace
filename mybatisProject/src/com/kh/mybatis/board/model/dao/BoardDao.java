package com.kh.mybatis.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.model.vo.PageInfo;

public class BoardDao {

	public int selectListCount(SqlSession sqlSession) {
		return sqlSession.selectOne("boardMapper.selectListCount");
	}
	
	public ArrayList<Board> selectList(SqlSession sqlSession, PageInfo pi) {
		// sqlSession.selectList("boardMapper.selectList");
		// 이렇게 하면 전체 리스트가 싹 조회됨
		
		// 마이바티스에서는 페이징 처리를 위해 RowsBounds라는 클래스 제공
	}
}
