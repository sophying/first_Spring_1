package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	
	public static void main(String[] args) {
		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("spring_applicationContext.xml");
		
		//2. Spring 컨테이너로부터 UserServiceImpl 객체를 Lookup 함
		UserService userService = container.getBean("userService",UserService.class);
		
		//3. 로그인 기능 테스트
		UserVO userVo = new UserVO();
		userVo.setId("sophy");
		userVo.setPassword("1234");
		
		UserVO user = userService.getUser(userVo);
		
		if (user != null) {
			System.out.println(user.getName() + " 님 환영합니다!!!");
			
		}else {
			System.out.println("로그인 실패");
		}
		
		//4. Spring 컨테이너 종료
		container.close();
	}

}
