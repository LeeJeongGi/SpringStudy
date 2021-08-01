package com.spring.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		
		System.out.println("확인=====");
		
		model.addAttribute("board", boardService.getBoard(vo));
//		model.addAttribute("board", boardDAO.getBoard(vo));
		
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 목록 검색 처리 ");
		
		if(vo.getSearchCondition() == null) {
			vo.setSearchCondition("TITLE");
		}
		if(vo.getSearchKeyword() == null) {
			vo.setSearchKeyword("");
		}
		
		//어노테이션으로 설정
		model.addAttribute("boardList", boardService.getBoardList(vo));
//		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("글 등록 처리");
		
		boardService.insertBoard(vo);
		
//		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("--> 글 수정");
		boardService.updateBoard(vo);
//		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("--> 글 삭제 기능");
		boardService.deleteBoard(vo);
//		boardDAO.deleteBoard(vo);
		
		return "getBoardList.do";
	}
}
