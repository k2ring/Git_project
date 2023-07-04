package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView; //Holder for both Model and View in the web MVC framework.
import org.springframework.web.servlet.mvc.Controller;
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
}
