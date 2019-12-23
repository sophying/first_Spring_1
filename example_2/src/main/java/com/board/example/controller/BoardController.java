package com.board.example.controller;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.example.dto.BoardDTO;
import com.board.example.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService boardService; 
	

	//현재 자주 쓰이는 Model 클래스를 DI 하는 방법
	@RequestMapping("list.do")
	public String boatdList(Model model) throws Exception{
		
		List<BoardDTO> list = boardService.boardList(); //list 변수에 결과 값 담음 
		model.addAttribute("list",list); //model 에 데이터 값을 담음
		return "board/board_list"; // board / board_list.jsp 로 이동
	}
	
	/*
		과거 ModelAndView 를 활용한 방법
		
		@RequestMapping("list.do")
		public ModelAndView boardMenu() throws Exception{
			List<BoardDTO> list = boatdService.boardList();
			ModelAndView mav = new ModelAndView();
			mav.setViewName("board/board_list");
			mav.addObject("list",list);
			return mav; // board/board_list.jsp 로 이동
		
		}
	
	
	 */
}
