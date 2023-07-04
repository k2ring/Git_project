package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView; //Holder for both Model and View in the web MVC framework.
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView("index.jsp");
		mav.addObject("dsfsksdkfadl", "niceㅋㅋㅋ"); //데이터 추가시
		return mav;
	}

}
