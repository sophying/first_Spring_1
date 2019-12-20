package com.springbook.biz.user.impl;


import org.springframework.stereotype.Service;
import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

/* annotation @Service / @Autowired 적용  */
import org.springframework.beans.factory.annotation.Autowired;

@Service("userService")
public class Anno_UserServiceImpl implements UserService {

	@Autowired
	private Anno_UserDAO userDAO;
	
	public void setUserDAO(Anno_UserDAO userDAO) {
		
		this.userDAO = userDAO;
		
	}
	
	@Override
	public UserVO getUser(UserVO userVo) { 
		return userDAO.getUser(userVo);
	}

	
}
