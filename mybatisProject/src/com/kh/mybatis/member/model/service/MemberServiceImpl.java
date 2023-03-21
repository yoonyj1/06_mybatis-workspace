package com.kh.mybatis.member.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.template.Template;

import com.kh.mybatis.member.model.dao.MemberDao;
import com.kh.mybatis.member.model.vo.Member;

public class MemberServiceImpl implements MemberService{

	private MemberDao mDao = new MemberDao();
	
	@Override
	public int insertMember(Member m) {
		/*
		 * 기존 방식
		 * 	
		 * Connection conn = JDBCTemplate.getConnection();
		 * 
		 * int result = new MemberDao().insertMember(conn, m)
		 * 
		 * if(result > 0) {
		 * 		JDBCTemplate.commit(conn);
		 * } else {
		 * 		JDBCTemplate.rollback(conn);
		 * }
		 * 
		 * JDBCTemplate.close(conn);
		 */
	
		// 새로운 방식 => myBatis 객체 사용
		// 기존에 Connection 객체 생성 코드 대신 사용할 코드
		SqlSession sqlSession = Template.getSqlSession();
		// 이때 mybatis-config.xml 문서 읽어들임
		
		int result = mDao.insertMember(sqlSession, m);
		
		if(result > 0) {
			sqlSession.commit();
		}
		
		// 단 건만 처리할 때는 사실 rollback 안해도 됨 => autocommit 꺼져있을 때
		// 연쇄적으로 처리할 때만 rollback 작성
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public Member loginMember(Member m) {
		SqlSession sqlSession = Template.getSqlSession();
		
		Member loginUser = mDao.loginMember(sqlSession, m);
		
		sqlSession.close();
		
		return loginUser;
	}

	@Override
	public int updateMember(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
