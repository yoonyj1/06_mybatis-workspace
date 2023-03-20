package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {

	
	public int insertMember(SqlSession sqlSession, Member m) {
		   /*
		    * int result = 0;
		    * PreparedStatement pstmt = null;
		    * String sql = prop.getProperty("insertMember");
		    * 
		    * try{
		    * pstmt = conn.preparedStatememt(sql);
		    * pstmt.setString(1, m.getUserId());
		    * pstmt.setString(2, m.getUserPwd());
		    * 
		    * result = pstmt.excuteUpdate();
		    * }catch(x){
		    * 
		    * }finally{
		    *    close(pstmt);
		    * }
		    * 
		    * return result;
		    * 
		    * */
		
		/*
		 * sqlSession에서 제공하는 메소드를 통해서 sql문 찾아서 실행하고 바로 결과 받음
		 * 
		 * 결과 = sqlSession.sql문 종류에 맞는 메소드("메퍼의 별칭.쿼리아이디",[미완성된 sql완성시킬객체])
		 */
		
		/*
		 * int result = sqlSession.insert("memberMapper.insertMember", m);
		 * 
		 * return result;
		 */
		return sqlSession.insert("memberMapper.insertMember", m);
	}
	
	public Member loginMember(SqlSession sqlSession, Member m) {
		
	}
}
