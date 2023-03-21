package com.kh.mybatis.board.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.model.vo.PageInfo;
import static com.kh.mybatis.common.template.Template.*;

public class BoardServiceImpl implements BoardService{

	@Override
	public int selectListCount() {
		SqlSession sqlSession = getSqlSession();
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi) {

		return null;
	}

	@Override
	public int increaseCount(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board selectBoard(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
