package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	
	@Override
	public void insertBoard(BoardVO boardVo) {
		boardDAO.insertBoard(boardVo);
	}

	@Override
	public void updateBoard(BoardVO boardVo) {
		boardDAO.updateBoard(boardVo);
	}

	@Override
	public void deleteBoard(BoardVO boardVo) {
		boardDAO.deleteBoard(boardVo);
	}

	@Override
	public BoardVO getBoard(BoardVO boardVo) {
		return boardDAO.getBoard(boardVo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO boardVo) {
		return boardDAO.getBoarList(boardVo);
	}

}
