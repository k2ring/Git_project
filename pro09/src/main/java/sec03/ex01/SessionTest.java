package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession  session=request.getSession();
//		System.out.println(session);
//		System.out.println(session.isNew());
//		System.out.println(session.getId());
//		
//		System.out.println(session.getMaxInactiveInterval());
//		session.setMaxInactiveInterval(3);
		System.out.println(session.isNew());
		System.out.println(session.getId());
		session.invalidate();
		HttpSession  session2=request.getSession();
		System.out.println(session2.isNew());
		System.out.println(session2.getId());
	}

}
