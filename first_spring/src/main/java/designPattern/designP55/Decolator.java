package designPattern.designP55;

public class Decolator implements IService {
	
	IService service;
	
	public String runSomething() {
		
		System.out.println("주 목적 : 호출에 대한 장식, "
				+ "Client 에게 반환하는 결과에 장식을 더하여 전달");
		
		service = new Service();
		
		return "혜련아!!! 힘내 !!! "+service.runSomething();
		
		/* 
		 추가적으로 다른 방식을 더하여 반환하는 역할 
		 
		 장식자는 실제 서비스와 같은 이름의 메소드를 구현 함.
		 이 때 interface 를 이용 함. 
		 장식자는 실제 서비스에 대한 참조 변수를 갖게 됨. (합성)
		 
		 장식자는 실제 서비스의 같은 이름의 메소드를 호출하고 그 반환 값에 
		 장식을 더하여 클라이언트에 반환 함. 
		 
		 장식자는 실제 서비스의 메소드 호출 전후에 별도의 로직을 수행할 수 있다. 
		 		 
		*/
	}

}
