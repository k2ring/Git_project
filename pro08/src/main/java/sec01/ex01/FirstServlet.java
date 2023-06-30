package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		response.sendRedirect("Second");
		out.print("<body>this is first page4</body>");
		
//		response.sendRedirect("second"); // 클라이언트의 요청에 특정 다른위치로 재전송
		
//		response.addHeader("Refresh", "5;url=second");	// 지정된 이름과 값으로 응답 헤더를 추가합니다.
//		response.addHeader("Refresh", "1");	// 이 방법을 사용하면 응답 헤더에 여러 값을 가질 수 있습니다.

		
//		out.print(" <script>location.href='http://www.naver.com'</script>");
//		out.print(" <script>location.href='second'</script>");
//		out.print(" <script>location.href='http://localhost:8090/pro08/first'</script>");
		
//		response.sendRedirect("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%ED%98%B8%EB%9E%91%EC%9D%B4");
		
		String str = URLEncoder.encode("호랑이","utf-8");
		
//		response.sendRedirect("second?akshgaouighaogh=adadf7&query=%ED%98%B8%EB%9E%91%EC%9D%B4");
		response.sendRedirect("second?akshgaouighaogh=adadf7&query=" + str);
		
		System.out.println("완료");
		System.out.println("===");
	}

}
