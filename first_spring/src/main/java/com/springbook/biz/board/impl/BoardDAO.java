package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

// DAO(Data Access Object)
@Repository("boardDAO")
public class BoardDAO  {

	//JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt=  null;
	private ResultSet resultSet = null;
	
	//SQL 명령어
	private final String S_BOARD_1_INSERT = "insert into S_BOARD_1 (SEQ , TITLE, WRITER, CONTENT) values((select nvl(max(SEQ), 0)+1 from S_BOARD_1), ?, ?, ?)";
	private final String S_BOARD_1_UPDATE = "update S_BOARD_1 set TITLE=?, CONTENT=? where SEQ=?";
	private final String S_BOARD_1_DELETE = "delete S_BOARD_1 where SEQ=?";
	private final String S_BOARD_1_GET = "select * from S_BOARD_1 where SEQ=?";
	private final String S_BOARD_1_LIST = "select * from S_BOARD_1 order by SEQ desc";
	
	//CURD 기능의 메소드 구현
	//글 등록
	public void insertBoard(BoardVO boardVo) {
		System.out.println("__________[ JDBC   insertBoard() 수행 ]____________\n");
		 
		try {
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(S_BOARD_1_INSERT);
			pstmt.setString(1,  boardVo.getTitle());
			pstmt.setString(2, boardVo.getWriter());
			pstmt.setString(3,  boardVo.getContent());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	//글 수정
	public void updateBoard(BoardVO boardVo) {
		System.out.println("__________[ JDBC   updateBoard() 수행 ]____________\n");
		
		try {
			
			conn = JDBCUtil.getConnection();;
			pstmt = conn.prepareStatement(S_BOARD_1_UPDATE);
			pstmt.setString(1, boardVo.getTitle());
			pstmt.setString(2, boardVo.getContent());
			pstmt.setInt(3,  boardVo.getSeq());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	//글 삭제
	public void deleteBoard(BoardVO boardVo) {
		System.out.println("__________[ JDBC   deleteBoard() 수행 ]____________\n");
		
		try {
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(S_BOARD_1_DELETE);
			pstmt.setInt(1,  boardVo.getSeq());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.close(pstmt, conn);
			
		}
	}
	
	
	//글 상세 조회
	public BoardVO getBoard(BoardVO boardVo) {
		System.out.println("__________[ JDBC   BoardVO getBoard() 수행 ]____________\n");		
		
		BoardVO board= null;
		
		try {
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(S_BOARD_1_GET);
			pstmt.setInt(1,  board.getSeq());
			
			resultSet = pstmt.executeQuery();
			
			if (resultSet.next()) {
				
				board = new BoardVO();
				board.setSeq(resultSet.getInt("SEQ"));
				board.setTitle(resultSet.getString("TITLE"));
				board.setWriter(resultSet.getString("WRITER"));
				board.setContent(resultSet.getString("CONTENT"));
				board.setRegDate(resultSet.getDate("REGDATE"));
				board.setCnt(resultSet.getInt("CNT"));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.close(resultSet, pstmt, conn);
		}
		return board;
	}
	
	//글 목록 조회
	public List<BoardVO> getBoarList(BoardVO boardVo){
		System.out.println("__________[ JDBC   List<BoardVO> getBoarList() 수행 ]____________\n");			
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(S_BOARD_1_LIST);
			resultSet = pstmt.executeQuery();
			
			while (resultSet.next()) {
				
				BoardVO board = new BoardVO();
				board.setSeq(resultSet.getInt("SEQ"));
				board.setTitle(resultSet.getString("TITLE"));
				board.setWriter(resultSet.getString("WRITER"));
				board.setContent(resultSet.getString("CONTENT"));
				board.setRegDate(resultSet.getDate("REGDATE"));
				board.setCnt(resultSet.getInt("CNT"));
				
				boardList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			JDBCUtil.close(resultSet, pstmt, conn);
			
		}
		return boardList;
	}
	
	
	/*
		@Component 와 @Repository  는 비슷하나  
		@Repository 는 DB 에서 다루는 예외 처리에 좀 더 특화 되어 있으므로 DAO 클래스에 활용 함 
	*/
	
	
}

