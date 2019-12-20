package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component // Component 등록
@Aspect    // Aspect 임을 알림
public class MyAspect_6 {
	
	@Pointcut("execution(* runSomething())")  // pointcut 설정 
	private void iampc() {
		
		System.out.println("왜 아무 의미가 없어?");
		//이 곳은 무엇을 작성해도 의미 없음!
		
	}
	
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		
		System.out.println("Aspect6 before()___[ @Before('iampc()')]");
		
	}
	
	@After("iampc()")
	public void after(JoinPoint joinPoint) {
		
		System.out.println("Aspect6 after()___[ @After('iampc()')]");
		
		
	}

}
