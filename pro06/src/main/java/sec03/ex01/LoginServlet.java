package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;  //직렬화를 위한 코드

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlet 객체 만들어짐");
	}

	public void destroy() {
		System.out.println("LoginServlet 객체 소멸");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter(); // ctrl +shift + o 라이브러리 임포트
		
		String user_id=request.getParameter("user_id"); // Returns the value of a request parameter as a String,or null if the parameter does not exist.
		
		String address=request.getParameter("address");
		System.out.println(address);
		pw.print(user_id +"님 방가방가" +  "</body>");

//		System.out.println(user_id);

		String[] sub=request.getParameterValues("subject");
		
		if(sub==null) {
			System.out.print("선택안함");
		}else {
			for(String i : sub) {
				System.out.println(i);
			}
		}
		
		

//		Enumeration<String> enu = request.getParameterNames();

		// 열거형
		//

//		System.out.println(enu);

//		for(String i : enu) {
//			
//		}

//		while (enu.hasMoreElements()) {
//			String name = enu.nextElement();
//			System.out.println(name);
//			System.out.println("=======");
//			String[] values = request.getParameterValues(name);
//			for (String value : values) {
//				System.out.println(name + ": " + value);
//			}
//			System.out.println("--------------------");
//		}

	}

}
