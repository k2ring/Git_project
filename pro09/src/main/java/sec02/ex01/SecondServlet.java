package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String user_id  = request.getParameter("djkjk");
		
		String user_pw  = request.getParameter("user_pw");
		String user_address  = request.getParameter("user_address");
		
		PrintWriter out = response.getWriter();
//		out.print("<html><body>"+ user_id+"님이 로그인함"+ user_pw +
//				"주소:" +
//				user_address+
//				" </body></html>");
		
		if (user_id != null && user_id.length() != 0) {
			out.println("이미 로그인 상태입니다!<br><br>");
			out.println("첫 번째 서블릿에서 넘겨준 아이디: " + user_id + "<br>");
			out.println("첫 번째 서블릿에서 넘겨준 비밀번호: " + user_pw + "<br>");
			out.println("첫 번째 서블릿에서 넘겨준 주소: " + user_address + "<br>");
			out.println("</body></html>");
		} else {
			out.println("로그인 하지 않았습니다.<br><br>");
			out.println("다시 로그입하세요!!<br>");
			out.println("<a href='/pro09/login.html'>로그인창으로 이동하기 </>");
		}
	}

}
