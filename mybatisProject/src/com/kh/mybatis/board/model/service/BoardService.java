package com.kh.mybatis.board.model.service;

import java.util.ArrayList;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.model.vo.PageInfo;

public interface BoardService {

	int selectListCount();
	
	ArrayList<Board> selectList(PageInfo pi);
	
	public int increaseCount(int boardNo);
	
	public Board selectBoard(int boardNo);
}
