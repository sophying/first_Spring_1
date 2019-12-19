package aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect_5 {
	
	@Pointcut("execution(* runSomething())")
	public void iampc() {
		
		// 이 곳은 무엇을 생성해도 무의미
	}
	
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		
		System.out.println("Aspect5 (before())___[ @Before('iampc()')]");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		
		System.out.println("Aspect5 (lockDoor())___[ @After('iampc()') ]");
	}

}

/*
	@Aspect
	
	클래스에 @Aspect 어노테이션을 추가하여 Aspect  생성함.
	이 설정이 되어있는 경우 Spring 은 자동적으로 @Aspect 어노테이션을 포함한 클래스를
	검색하여 Spring AOP 설정에 반영 함 
	
	
	@Around 

    Pointcut("execution(* runSomething())") 에 해당되는 메소드가 실행되기 전에 
    @Around 어노테이션이 적용된 메소드가 실행되고 이후 메소드는 실행을 안함    
    즉, 본인만 실행 후 마침 

*/