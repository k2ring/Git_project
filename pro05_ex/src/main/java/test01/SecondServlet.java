package test01;

import java.io.IOException;
import java.io.PrintWriter; //Prints formatted representations of objects to a text-output stream.

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/fdgfdadfffd")
public class SecondServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("SecondServlet 객체 생성시만 만들어짐");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("고객의 서비스 요청이 들어옴");
		
		response.setContentType("text/html; charset=UTF-8");  //Sets the content type of the response being sent to the client
		
		PrintWriter out =response.getWriter();  //Returns a PrintWriter object thatcan send character text to the client.
//		System.out.println(out);
		
		out.print("<body>hi555");
		out.print("<br>");
		out.print("nice555 하하 </body>");
		
		
		
//		String html="";
//		
//		
//	
//		html += "<body>";
//		html += "hi2<br>nice2";
//		html += "</body>";
		
//		System.out.println(html);
//		
//		out.print(html);
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("SecondServlet 객체 소멸시 찍힘");
	}

}
