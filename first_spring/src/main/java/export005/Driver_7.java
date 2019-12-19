package export005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_7 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("export005/export005.xml");
		
		Car car = context.getBean("car", Car.class);
		
		System.out.println(car.getTireBrand());
		
	}

}

/*

1. ApplicationContext / ClassPathXmlApplicationContext 활용하여 xml 속 bean 으로 들어갈 객체 생성
2. xml 과 연동된 (context 객체) 가 가지고 있는 getBean 메소드에  id = "car" , Car클래스의 객체를 
   전달하여 xml 에서 해당 객체를 찾음  -> 변수 car 에 담음
   
3. Car 클래스 속 Tire 객체를 어노테이션 으로 확인  xml 속에서 해당되는 id 값을 찾아 tire 에 담음
	- Tire를 구현하고있는 클래스 KoreaTire / AmericaTire 클래스 중에 하나의 객체 생성 
	- 그 객체를 담은 변수 car 

4. car.getTireBrand() 메소드에서 그  tire.getBrand()  값을 가져옴 

*/