package com.spring.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.view.controller.Controller;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

		// 1.사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2.Db 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
		// 3.화면 네비게이션
		if (user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}
		
	}

}
