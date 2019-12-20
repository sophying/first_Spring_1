package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/* annotation @Repository 적용  */
import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

//DAO(Data Access Object)
@Repository("userDAO")
public class Anno_UserDAO {
	
	//JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet resultSet = null;
	
	//SQL 명령어
	private final String S_USER_GET = "select * from S_USER where ID=? and PASSWORD=?";
	
	//CRUD 기능의 메소드 구현
	//회원 등록
	public UserVO getUser(UserVO userVo) {
		UserVO user = null;
		
		try {
			
			System.out.println("__________[ JDBC   getUser() 수행 ]____________\n");
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(S_USER_GET);
			pstmt.setString(1, userVo.getId());
			pstmt.setString(2,  userVo.getPassword());
			
			resultSet = pstmt.executeQuery();
			
			if (resultSet.next()) {
				user = new UserVO();
				
				user.setId(resultSet.getString("ID"));
				user.setPassword(resultSet.getString("PASSWORD"));
				user.setName(resultSet.getString("NAME"));
				user.setRole(resultSet.getString("ROLE"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			
			JDBCUtil.close(resultSet, pstmt, conn);
		}
		
		return user;
	}

}
