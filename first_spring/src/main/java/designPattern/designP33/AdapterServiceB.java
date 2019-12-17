package designPattern.designP33;

public class AdapterServiceB {
	
	ServiceB sb1 = new ServiceB();
	
	void runService() { // 메소드를 통해 호출 
		
		sb1.runServiceB();
	}

}
