package com.spring.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리 ");
		
		//어노테이션으로 설정
		mav.addObject("boardList", boardDAO.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		
		return mav;
		
		// 1.사용자 입력 정보 추출(검색 기능은 나중에 구현)
		// 2.db 연동 처리
//		BoardVO vo = new BoardVO();
//		BoardDAO boardDAO = new BoardDAO();
//		List<BoardVO> boardList = boardDAO.getBoardList(vo);
//		
//		// 3.검색결과를 세션에 저장하고 목록 화면을 리턴한다
////		HttpSession session = request.getSession();
////		session.setAttribute("boardList", boardList);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("boardList", boardList);
//		mav.setViewName("getBoardList.jsp");
//		
//		return mav;
	}
}
