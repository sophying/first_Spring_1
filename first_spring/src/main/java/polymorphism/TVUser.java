package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import practice.Tv;

public class TVUser {

		public static void main(String[] args) {
//			SamsungTV tv = new SamsungTV();
//			LgTV tv = new LgTV();
			
//			TV tv = new LgTV();
//			TV tv = new SamsungTV();
//			TV tv = new DeawooTV();
	
/*  BeanFactory 생성 _Design Pattern */
			
/* TVUser  >  Run As  > Run Configurations >  Arguments  > Program arguments */  	
			
//			BeanFactory factory = new BeanFactory();
			
		   
		// 1. Spring container 구동	
		   AbstractApplicationContext factory = 
				   new GenericXmlApplicationContext("applicationContext.xml");
			
			
		// 2. Spring container 로부터 필요한 객체를 요청(Lookup)   
		   
		   /* 
			    getBean() 메소드를 활용하여 ClassName 을 받고 이를 factory 에 전달하여  
			    해당 이름을 가진 객체를 찾아 반환 
		   */

		   
		   // Singleton Pattern
		   /* 하나의 객체를 공유 함  */
			TV tv1 = (TV) factory.getBean("tv");	
			TV tv2 = (TV) factory.getBean("tv");	
			TV tv3 = (TV) factory.getBean("tv");	
/*			

			TV tv7 = factory.getBean("tv");	 // id 로 찾을 경우, 형변환 o 
			TV tv7 = factory.getBean(SamsungTV.class);	 // class가 작성되었을 경우, 형변환 X -> class 명을 찾아감
			TV tv7 = factory.getBean("tv",SamsungTV.class);	 // 기본 형식 
*/			
			System.out.println(tv1);
			System.out.println(tv2);
			System.out.println(tv3);

			
			factory.close();
			
/*		   
 // destroy-method
			TV tv = (TV) factory.getBean("tv");
			
			tv.powerOn();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeDown();
			tv.volumeDown();
			tv.powerOff();
			
			factory.close();
*/		   
		   
/*	   
// <bean> 에 id 가 생략되었을 때 원하는 객체를 실행하고자 할 경우 
			
			TV tv = (TV) factory.getBean(SamsungTV.class);
			
			tv.powerOn();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeDown();
			tv.volumeDown();
			tv.powerOff();
*/		

		}
}
