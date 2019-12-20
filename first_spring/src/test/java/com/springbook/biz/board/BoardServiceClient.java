package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		
		//1.Spring 컨테이너를 구동함
		AbstractApplicationContext container = new GenericXmlApplicationContext("spring_applicationContext.xml");
		
		//2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup 함
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. 글 등록 기능 테스트
		BoardVO boardVo = new BoardVO();
		boardVo.setTitle("임시 제목");
		boardVo.setWriter("쏘쀠");
		boardVo.setContent("사랑스러운 쏘쀠");
		
		boardService.insertBoard(boardVo);
		
		//4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(boardVo);
		
		for (BoardVO board : boardList) {
			System.out.println("------->" + board.toString());
		}
		
		//5. Spring 컨테이너 종료
		container.close();
	}

}

/*
	AbstractApplicationContext   :   객체 생성과 동시에 즉시 로딩 
	GenericXmlApplicationContext : ("spring_applicationContext.xml") XML 설정 파일 로딩 및 구동 
	
	getBean  : Context 의 역할 중 하나로 xml 설정 파일 속 객체 ("boardService")를 찾는 역할 
	
	
*/