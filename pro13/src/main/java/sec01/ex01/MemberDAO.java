package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext; //이름 찾기위한 작업 위해 사용하는 클래스
import javax.naming.NamingException;
import javax.sql.DataSource; // 실질적인 어떤 데이터인지를 연결하는 객체

public class MemberDAO {
	// 필


	private Connection con;
	private DataSource dataFactory;
	private PreparedStatement pstmt;

	public MemberDAO() {
		// JNDI방식의 연결로 MemberDAO 객체를 초기화

		try {
			Context ctx = new InitialContext(); // 컨텍스트 작업을 위한 객체
			Context envContext = (Context) ctx.lookup("java:/comp/env"); // 오라클인지 mysql인지의 환경을 찾기위한 컨텍스트
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			System.out.println("톰캣의 context.xml에 정의되어 있는 이름부분에서 정확하지 않은 에러");
//			e.printStackTrace();
		}

	}

	// 메
	public List<MemberBean> listMembers() {
		List<MemberBean> list = new ArrayList<MemberBean>();
		try {
			con = dataFactory.getConnection();
			String query = "select * from t_member ";
//			System.out.println("prepareStatememt: " + query);
			query += "order by joinDate desc ";
			
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberBean vo = new MemberBean();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return list;
	}

	// 커넥션 DB이므로 미리 연결객체를 만들어 놨기 때문에 필요없음
//	private void connDB() {  
//	}

	
	public List<MemberBean> listMembers(MemberBean member) {
		List<MemberBean> list = new ArrayList<MemberBean>();
		
		try {
			con = dataFactory.getConnection();
			
			String name=member.getName();
			
			System.out.println(name);
			String query = "select * from t_member ";
			
			if(name !=null && name.length() !=0) {
				query = query + "where name=?" ;
				pstmt = con.prepareStatement(query);				
				pstmt.setString(1, name);
			}else {
				pstmt = con.prepareStatement(query);
			}			
					
     		System.out.println("prepareStatememt: " + query);		
			
			
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name_ = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				
				MemberBean vo = new MemberBean();
				
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	public void addMember(MemberBean memberVO) {
		try {
			con =  dataFactory.getConnection();
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			
			
			String query = "insert into t_member(id, pwd, name, email) values (?,?,?,?)"  ;
			System.out.println(query);
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("회원 추가시 에러");
//			e.printStackTrace();
		}
	}
	
	
	
	
	public void delMember(String id){
		try {
			con =  dataFactory.getConnection();
			String query = "delete from t_member" + " where id=?";
			System.out.println("prepareStatememt:" + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("회원삭제시 에러");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	public boolean isExisted(MemberBean memberVO) {
		boolean result = false;
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		try {
			con = dataFactory.getConnection();
			String query = "select decode(count(*),1,'true','false') as result from t_member";
			query += " where id=? and pwd=?";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			rs.next(); 
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result=" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
}
