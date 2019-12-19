package aop004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_4 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop004/aop004.xml");
		
		Person tom = context.getBean("man",Person.class);
		Person anna = context.getBean("woman",Person.class);
		
		System.out.println();
		tom.runSomething();
		
		System.out.println();
		anna.runSomething();
		
	}
}
