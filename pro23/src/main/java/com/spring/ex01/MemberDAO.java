package com.spring.ex01;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;	// mybatis 작업을 위한 기본 자바 인터페이스. 이 인터페이스를 통해
												// 명령을 실행하고, mapper를 가져오고, 트랜잭션(DB all or nothing)을 관리.
import org.apache.ibatis.session.SqlSessionFactory;	// DB 접속을 위한 공장
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	
	// DB 연결 코드 작성
	
	public static SqlSessionFactory sqlMapper = null;
	
	// 동적(필요시) 객체 생성
	
	SqlSessionFactory getInstance() {
//		sqlMapper 유효성(null 여부) 검사
		
		if(sqlMapper == null) {
			
			String resource = "mybatis/SqlMapConfig.xml";
			
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				
				reader.close();
			} catch (Exception e) {
				System.out.println("sqlMap 설정파일 불러오는데 있어서 에러남");
//				e.printStackTrace();
			}
			
		}
		
		
		return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		
		SqlSession session = sqlMapper.openSession();
		
		List<MemberVO> memberList = session.selectList("mapper.member.selectAllMemberList");
		
		return memberList;
	}
	
	public void addMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
//		session.insert("mapper.member.addMember"); // 매개변수 안넣으면
		session.insert("mapper.member.addMember", memberVO);
		session.commit();	// sqlSession은 commit 꼭 해줘야함
	}
	
	
	
	
}
	
