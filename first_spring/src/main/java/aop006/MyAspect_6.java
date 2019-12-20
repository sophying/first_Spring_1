package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component /* 스캔 할 대상으로 등록 */
@Aspect    /* Aspect 설정 */
public class MyAspect_6 {
	
	/* pointCut 설정 */
	@Pointcut("execution(* runSomething())") 
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
