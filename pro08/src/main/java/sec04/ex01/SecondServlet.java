package sec04.ex01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

	// 이 request는 second를 가져오라는 요청

	protected void doger(HttpServletRequest request, HttpServletResponse response) {

		String str = (String) request.getAttribute("menu");
//		System.out.println(request);
		System.out.println(str);
	}
}
