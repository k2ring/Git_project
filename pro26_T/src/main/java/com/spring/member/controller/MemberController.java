package com.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.spring.member.vo.MemberVO;

public interface MemberController {

		public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
		
		public ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
		public ModelAndView addMember(@ModelAttribute("member") MemberVO member, HttpServletRequest request, HttpServletResponse response) throws Exception;
		public ModelAndView modMemberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
		public ModelAndView delMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
		
		public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
		
		
		
		public ModelAndView search(HttpServletRequest request, HttpServletResponse response) throws Exception;
		
		
		

}