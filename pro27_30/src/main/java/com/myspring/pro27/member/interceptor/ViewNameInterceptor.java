package com.myspring.pro27.member.interceptor;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro27.member.vo.MemberVO;

public class ViewNameInterceptor {

//	private statics final Logger logger = LoggerFactory.getLogger(ViewNameInterceptor.class);
//	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		
//		try {
//			String viewName = getViewName(request);
//			request.setAttribute("viewName", viewName);
//		} catch(Exception e) {
//			logger.info("여긴 인터셉터 요청 이름 가져오면서 (getviewName()) 에러남);"
//		}
//		
//	}
//	
//	
//	
//	
//	
//	@Override
//	@RequestMapping(value = "/member/listMembers.do", method = RequestMethod.GET)
//	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
////		String viewName = getViewName(request);
//		
//		String viewName = (String)request.getAttribute("viewName");
//		logger.info("인터셉터에서 넘어온 뷰네임" + viewName);
//		List<MemberVO> membersList = memberService.listMembers();
//		
//		ModelAndView mav = new ModelAndView(viewName);
//		
//		mav.addObject("membersList", membersList);
//		
//		System.out.println("뷰네임ss", viewName);
//		logger.info("뷰네임", viewName);
//		
//		return mav;
//		
//	}
	
}
