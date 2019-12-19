package aop003;

import org.aspectj.lang.JoinPoint;

public class MyAspect_3 {
	
	public void before(JoinPoint joinPoint) {
		
		System.out.println("Aspect (Before)___[ JoinPoint + PointCut ]");
		
	}

}

/*
	PointCut ( where )
	
	Advice ( when + what ) :
	
		PointCut 을 적용할 로직. 즉, 메소드를 의미 함
		언제(when) 라는 개념까지 포함하고 있으며, 결국  Advice 는 PointCut 에 
		언제(when) 무엇(what)을 적용할 지 정의 되어있는 메소드 	
		
	
	Aspect ( when + where + what ) :   ~ 실행하기 전에 , ~ 앞에(before) ~뒤에(after) ... , (joinPoint) ~ 을 적용하라 
	
		AOP 에서 여러개의 Advice 와 여러개의 PointCut 의 결합체를 의미
			
			< 수식 >
				Ascpect = Advice ( when / what )+ PointCut ( where )
						= 언제 + 어디에 + 무엇을
						
*/