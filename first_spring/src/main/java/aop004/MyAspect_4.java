package aop004;

import org.aspectj.lang.JoinPoint;

public class MyAspect_4 {
	
	public void before(JoinPoint joinPoint) {
		System.out.println();
		System.out.println("Aspect4 (Before)___[ JoinPoint(메소드) + PointCut ]");
		System.out.println();
		
	}
	
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println();
		System.out.println("Aspect4 (lockDoor())___[ MyAspect_4 에 담겨있는 메소드 ]");
		
	}

}
