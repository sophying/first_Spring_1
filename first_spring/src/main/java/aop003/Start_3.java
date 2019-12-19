package aop003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop003/aop003.xml");
		
		Person tom = context.getBean("man", Person.class);
		Person anna = context.getBean("woman", Person.class);
		Person baby = context.getBean("baby", Person.class);
		
		System.out.println();
		tom.runSomething();
		
		System.out.println();
		anna.runSomething();
		
		System.out.println();
		baby.runSomething();
	}
	
	
}
