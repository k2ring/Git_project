package com.spring.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member.do")
public class MemberServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		MemberDAO dao = new MemberDAO();
		
		String action = request.getParameter("action");
		System.out.println("액션 값 : " + action);
		String nextPage = "";
		
		if (action == null || action.equals("listMembers")) {
			
			List<MemberVO> membersList = dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			
			nextPage = "test01/listMembers.jsp";
			
		} else if (action.equals("addMember")) {
			System.out.println("회원추가코드");
			
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			System.out.println(id + "," + pwd + "," + name + "," + email);
			MemberVO memberVO = new MemberVO(id, pwd, name, email);
			dao.addMember(memberVO);
			nextPage = "/member.do?action=listMembers";
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher("test01/listMembers.jsp");
		dispatch.forward(request, response);
	}

}
