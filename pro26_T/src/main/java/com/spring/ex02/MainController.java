package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main2")
public class MainController {

//	@RequestMapping("/hihi")
//	public ModelAndView method1(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("hihi");
//		//return new ModelAndView("hihi");
//		
////		ModelAndView mav=new ModelAndView();
////		mav.setViewName("hihi");
//		//ModelAndView mav=new ModelAndView("hihi");
//		return new ModelAndView("hihi");
//	}
	
	
	
	
	@RequestMapping(value = "/login4.do",method = RequestMethod.GET )
	public ModelAndView method2(@ModelAttribute("user") LoginVO loginVo,   HttpServletRequest request, HttpServletResponse response){
		System.out.println("이것은 login4 여 -GET");
//		System.out.println(loginVo);
		return new ModelAndView("loginForm");
	}
	
	//@ModelAttribute  : 메서드 매개변수 또는 메서드 반환 값을 명명된 모델 속성에 바인딩하는 주석
	@RequestMapping(value = "/login4.do",method = RequestMethod.POST )
	public ModelAndView method3(@ModelAttribute("user") LoginVO loginVo,   HttpServletRequest request, HttpServletResponse response){
		System.out.println("이것은 login4 여 - POST");
		System.out.println("나와라!!!");
		
		System.out.println(loginVo.getUserID());
		System.out.println(loginVo.getUserName());
		
		return new ModelAndView("loginResult");
		
		
		
		
	}
}