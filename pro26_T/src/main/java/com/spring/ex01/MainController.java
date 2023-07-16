package com.spring.ex01;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*@Controller*/
/* @RequestMapping("/main") */
public class MainController {
	
//	@RequestMapping(value = "/dsffdsf.do", method = RequestMethod.POST)
//	public void main1(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("hihihi-post");
//		
//	}
//	
//	@RequestMapping(value ="/dsffdsf.do",method = RequestMethod.GET )
//	public void main2(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("hihihi-get");
//	}
//	
//	
//	
//	@RequestMapping(value = "/mavRequest.do")
//	public ModelAndView main3(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("modelAndView로");
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("hi3");
//		return mav;
//	}
//	
//	
//	
//	@RequestMapping(value = "/mavRequest4.do")
//	public ModelAndView main4(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("modelAndView로 데이터도 나오게");
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("fdwfqerfwe", "nice55");
//		mav.setViewName("hi4");
//		return mav;
//	}
	
	/* @RequestMapping(value = "/login.do", method = RequestMethod.GET) */
	public ModelAndView loginGet(HttpServletRequest request, HttpServletResponse response){
		System.out.println("이것은 로그인-GET");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
	

//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public ModelAndView loginPost(@RequestParam String userID,  HttpServletRequest request, HttpServletResponse response){
//		// @RequestParam 		웹 request 요청시 매개변수에 저장되어 값을 전달 할 수 있는 어노테이션 Annotation which indicates that a method parameter should be bound to a web request parameter.
//		System.out.println("이것은 로그인-POST");
////		String userID=request.getParameter("userID");
////		System.out.println(userID);
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userID", userID);
//		mav.setViewName("loginResult");
//		return mav;
//	}
	
	
	
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public ModelAndView loginPost2(@RequestParam String userID, @RequestParam String userName,  HttpServletRequest request, HttpServletResponse response){
//		// @RequestParam 		웹 request 요청시 매개변수에 저장되어 값을 전달 할 수 있는 어노테이션 Annotation which indicates that a method parameter should be bound to a web request parameter.
//		System.out.println("이것은 로그인-POST");
////		String userID=request.getParameter("userID");
////		System.out.println(userID);
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userID", userID);
//		mav.addObject("userName", userName);
//		mav.setViewName("loginResult");
//		return mav;
//	}
	
	
	
	
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public ModelAndView loginPost2(@RequestParam(value = "userID") String userID, @RequestParam String userName, @RequestParam(required = false) String email,  HttpServletRequest request, HttpServletResponse response){
//		// @RequestParam 		웹 request 요청시 매개변수에 저장되어 값을 전달 할 수 있는 어노테이션 Annotation which indicates that a method parameter should be bound to a web request parameter.
//		System.out.println("이것은 로그인-POST");
////		String userID=request.getParameter("userID");
////		System.out.println(userID);
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userID", userID);
//		mav.addObject("userName", userName);
//		mav.addObject("email", email);
//		
//		System.out.println(userID + "," + userName + "," + email);
//		
//		mav.setViewName("loginResult");
//		return mav;
//	}
	
	
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public ModelAndView loginPost2(@RequestParam  Map<String, String> map,  HttpServletRequest request, HttpServletResponse response){
//		// @RequestParam 		웹 request 요청시 매개변수에 저장되어 값을 전달 할 수 있는 어노테이션 Annotation which indicates that a method parameter should be bound to a web request parameter.
//		System.out.println("이것은 로그인-POST2");
//
//		
//		String userID=map.get("userID");		
//		String userName=map.get("userName");
//		String email=map.get("email");
//		
//		
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userID", userID);
//		mav.addObject("userName", userName);
//		mav.addObject("email", email);
//		
//		System.out.println(userID + "," + userName + "," + email);
//		
//		mav.setViewName("loginResult");
//		return mav;
//	}
	
	
	// request parameter가 많을 때 map 객체 이용	
	/* @RequestMapping(value = "/login.do", method = RequestMethod.POST) */
	public ModelAndView loginPost2(@RequestParam  Map<String, String> info,  HttpServletRequest request, HttpServletResponse response){
		// @RequestParam 		웹 request 요청시 매개변수에 저장되어 값을 전달 할 수 있는 어노테이션 Annotation which indicates that a method parameter should be bound to a web request parameter.
		System.out.println("이것은 로그인-POST2");

		ModelAndView mav=new ModelAndView();
		
//		String userID=info.get("userID");		
//		String userName=info.get("userName");
//		String email=info.get("email");
		
		
		
		mav.addObject("info", info);

	
		
//		System.out.println(userID + "," + userName + "," + email);
		
		mav.setViewName("loginResult");
		return mav;
	}
	
}