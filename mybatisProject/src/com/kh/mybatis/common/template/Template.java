package com.kh.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {

	/*
	 * 기존 JDBC
	 * public static Connection getConnection(){
	 * 		// driver.properties 파일 읽어들여서 
	 * 		// 해당 DB와 접속된 Connection rorcp 생성해서 반환
	 * }
	 * 
	 * public static void close(JDBC용 객체(ResultSet, Statement, Connection)){
	 * 		// 전달받은 JDBC용 객체를 반납시키는 구문
	 * }
	 * 
	 * public static void commit|rollback(Conn){
	 * 		// 트랜잭션 처리
	 * }
	 */
	
	// 마이바티스
	public static SqlSession getSqlSession() {
		// mybatis-config.xml 파일 읽어들여서 해당 db와 접속된 sqlSession 객체 생성해서 반환
		SqlSession sqlSession = null;
		
		// sqlSession 생성하기 위해서 => sqlSessionFactory 필요
		// sqlSessionFactory 생성하기 위해서 => sqlSessionFactoryBuilder 필요
		String resource = "/mybatis-config.xml"; // /하게되면 소스의 최상위 폴더
		
		try {
			InputStream stream = Resources.getResourceAsStream(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession(false);
							// openSession(): 기본값 false
							// openSession(boolean autocommit): 자동 commit 여부(true - O, false - X)
							// => 개발자가 autoCommit 여부를 직접 설정함
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSession;
	}
}
