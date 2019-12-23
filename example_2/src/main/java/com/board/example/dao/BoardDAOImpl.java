package com.board.example.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;  // mybaits 에 담겨있는 ibatis  pom.xml 에 들어와있다는 것을 의미 
import org.springframework.stereotype.Repository;

import com.board.example.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {// BoardDAO 를 implements 한  Class

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	} 
	

}
