package com.spring.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController  {
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("--> 글 삭제 기능");
		
		boardDAO.deleteBoard(vo);
		
		return "getBoardList.do";
		
//		//1. 사용자 입력 정보 추출
//		String seq = request.getParameter("seq");
//		
//		//2. db연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.deleteBoard(vo);
//		
//		ModelAndView mdv = new ModelAndView();
//		mdv.setViewName("getBoardList.do");
//		
//		return mdv;
	}

}
