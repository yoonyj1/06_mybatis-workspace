package com.kh.mybatis.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public interface BoardService {

	int selectListCount();
	
	ArrayList<Board> selectList(PageInfo pi);

	// 게시글 상세조회
	public int increaseCount(int boardNo);
	public Board selectBoard(int boardNo);
	
	// 댓글 조회
	ArrayList<Reply> selectReplyList(int boardNo);
	
	// 게시글 검색
	int selectSearchCount(HashMap<String, String> map);
	ArrayList<Board> selectSearchList(HashMap<String, String> map, PageInfo pi);
}