package aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_5 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop005/aop005.xml");
		
		Person tom = context.getBean("man", Person.class);
		Person anna = context.getBean("woman", Person.class);
		
		System.out.println();
		tom.runSomething();
		
		System.out.println("\n\n");
		anna.runSomething();
		
		
	}

}
