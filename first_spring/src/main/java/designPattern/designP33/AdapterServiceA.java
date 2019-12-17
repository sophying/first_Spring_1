package designPattern.designP33;

public class AdapterServiceA {
	
	ServiceA sa1 = new ServiceA();
	
	//  메소드가 호출 되었을 때.
	void runService() {
		
		// ServiceA 에 있는 메소드를 객체가 호출 함  메소드 안에 메소드로 이중으로 호출되는 방식  
		sa1.runServiceA();
	}

}
