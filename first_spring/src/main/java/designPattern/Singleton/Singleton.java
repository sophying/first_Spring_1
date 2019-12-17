package designPattern.Singleton;

public class Singleton {

	static Singleton singletonObject;
	
	private Singleton() {
		
		// private  생성자_현재 해당 class 내에서만 활용될 수 있다는 의미 
		
	}
	
	// 객체 변환 정적 메소드
	
	public static Singleton getInstance() {

		// 객체가 아직 생성되지 않았다면, 객체를 새롭게 만들어라 
		if (singletonObject == null) { 
			singletonObject = new Singleton();
		}
		
		// 처음에는 만들어지기 전이므로 새롭게 주소를 생성하며, 이 후에 호출되면 가지고 있던 객체의 주소를 반환 
		return singletonObject; 
	}
}
