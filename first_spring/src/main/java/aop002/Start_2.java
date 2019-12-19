package aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop002/aop002.xml");
		
		Person tom1 = context.getBean("man", Person.class);
		Person anna1 = context.getBean("woman", Person.class);
		
		tom1.runSomething();
		System.out.println("");
		anna1.runSomething();
		
	}

}
