package com.spring.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		
		System.out.println("---> 로그인 기능");
		
		if(userDAO.getUser(vo) != null) return "getBoardList.do";
		else return "login.jsp";
		
//		// 1.사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		
//		// 2.Db 연동 처리
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
//		
//		// 3.화면 네비게이션
//		ModelAndView mav = new ModelAndView();
//		if (user != null) {
//			mav.setViewName("getBoardList.do");
//		} else {
//			mav.setViewName("login.jsp");
//		}
//		
//		return mav;
		
	}

}
