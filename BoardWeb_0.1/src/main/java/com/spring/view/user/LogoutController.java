package com.spring.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("로그 아웃 처리");
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		ModelAndView mdv = new ModelAndView();
		mdv.setViewName("redirect:login.jsp");
		
		return mdv;
	}

}
