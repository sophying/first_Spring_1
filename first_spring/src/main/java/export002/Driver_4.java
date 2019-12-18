package export002;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Driver_4 {
	
	public static void main(String[] args) {
		
		// export002 패키지 > export002.xml  에서 
		ApplicationContext context = new ClassPathXmlApplicationContext("export002/export002.xml");
		
		
		//export002.xml 에서 id 가 car 이며 Car_4 클래스를 찾아  그 객체 값을 car 변수에 담음 
		Car_4 car = context.getBean("car",Car_4.class);
		
		// americaTire id를 가진 Tire 클래스의 객체를 tire 에 담음 
		Tire tire = context.getBean("americaTire",Tire.class);
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
	

}
