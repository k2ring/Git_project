package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value =  "/first")
public class FirstServlet extends HttpServlet {

	// 서블릿 생명주기(init(), service()는 doGet(){}, doPost(){} 두 메소드 중 하나가 동작, destroy()는 소멸

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet 초기화됨");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("hi");
	}
	
	
	
	@Override
	public void destroy() {
	System.out.println("FirstServlet 소멸됨");
	}

}
