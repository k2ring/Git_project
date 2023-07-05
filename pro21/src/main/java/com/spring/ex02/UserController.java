package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView; //Holder for both Model and View in the web MVC framework.
import org.springframework.web.servlet.mvc.multiaction.MultiActionController; // 같은 클래스내에서 다양한 요청 처리 Controller implementation that allows multiple request types to be handled by the same class

public class UserController extends MultiActionController{

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		ModelAndView mav=new ModelAndView("index.jsp");
//		mav.addObject("k", "nice");
//		return mav;
//	}

	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID = "";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		/* request.setCharacterEncoding("utf-8"); */
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");
		
		mav.addObject("userID", userID);
		mav.addObject("passwd", passwd);
		
		mav.setViewName("result");  //setViewName(화면 뷰);
		//mav.setViewName("hhh");  //setViewName(화면 뷰);
		return mav;
	}
	
	
	private String getViewName (HttpServletRequest request) throws Exception{
		String contextPath = request.getContextPath();
		
		System.out.println("컨텍스트 경로 : " + contextPath);
		String uri=(String) request.getAttribute("javax.servlet.include.request_uri");
		System.out.println(uri);
		if(uri == null || uri.trim().equals("")) {
			uri=request.getRequestURI();
			System.out.println("요청하는 uri" + uri);
		}
		
		System.out.println("컨텍스트패스 길이" + contextPath.length());
		
		int begin=0;	// 시작 위치
		
		if(contextPath != null && ( ! ("".equals(contextPath)))) {
			begin = contextPath.length();
			System.out.println("시작위치 : " + begin);
		} 
		
		System.out.println();
		
		int end;
		if(uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
			System.out.println(end);
		} else if ( uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
			System.out.println(end);
		} else {
			end = uri.length();
			System.out.println("uri의 길이 : " + end);
		}
		
		String fileName = uri.substring(begin, end);
		System.out.println("중간 파일명 : " + fileName);
		
		if(fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		
		if(fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"),fileName.length() );
			System.out.println("최종 파일명 : " + fileName);
		}
		
		return fileName;
		
	}
			
	
	
	
	public ModelAndView memberInfo (HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		mav.addObject("id",id);
		mav.addObject("pwd",pwd);
		mav.addObject("name",name);
		mav.addObject("email",email);
		
		String viewName = getViewName(request);
		System.out.println("뷰네임 : " + viewName);
//		mav.setViewName(viewName);
		mav.setViewName("memberInfo");
		
		return mav;
	}
}
