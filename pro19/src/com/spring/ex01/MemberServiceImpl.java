package com.spring.ex01;

public class MemberServiceImpl implements MemberService{

	
	MemberDAO memberDAO;
	
	
	
//	public MemberServiceImpl() {
//		memberDAO= new MemberDAOImpl();
//	}
	
	
	
	public MemberDAO getMemberDAO() {
		return memberDAO;
	}







	
	 public void setMemberDAO(MemberDAO memberDAO) { this.memberDAO = memberDAO; }
	





	@Override
	public void listMembers() {
		System.out.println("멤버가 화면에 나옴1");
		memberDAO.listMembers();
	}







	

}
