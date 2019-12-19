package aop002;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

//모든 runSomething 실행 전에 아래 메소드를 먼저 실행 시켜라 
//	@Before("execution(* runSomething())")  
	
	
	@Before("execution(public void aop002.Man_1.runSomething())") // Class 가 여러개 일 경우 
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 여십시오.");
	}
}

/*
	횡단(수평) 관심사 역할 
	공통된 행동을 먼저(before) 실행하도록 함
	
	
	execution(* runSomething())

 	접근 제한자는 무엇이라도 좋으며 return 타입도 무엇이든 좋으며 
	패키지 밑의 모든 클래스 안에 파라미터가 없으며, 던져지는 예외가 있으나, 없으나 
	이름이 runSomething() 인 메소드를 pointcut 으로 지정함 
	
	pointcut 의 후보가 되는 모든 메소드들이 joinpoint 
	즉,  Aspect 적용이 가능한 지점이 됨.
	
	joinpoint 란 'Aspect' 적용이 가능한 모든 지점을 말함.
*/