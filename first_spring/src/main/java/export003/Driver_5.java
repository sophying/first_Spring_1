package export003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_5 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("export003/export003.xml");
		
/* car 라는 id 를 가진 객체를 <bean>  에서 찾아 car 변수에 담음 
 * getBean  : Object 를 반환하므로 형변환 필수 
 */
		//Car car = (Car) context.getBean("car");
		
/* car 라는 id 를 가진 객체 Car 클래스를 <bean> 에서 찾아 car 변수에 담음  
 * 형변환 필요없음 이미 Car 객체로 정의 되었으므로 
 */		
		Car car = context.getBean("car", Car.class);
		
		System.out.println(car.getTireBrand());
		
	}

}
