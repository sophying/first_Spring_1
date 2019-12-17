package designPattern.designP44;

public class Proxy_1 implements IService{

	IService service1;
	
	
	@Override
	public String runSomething() {
		
		System.out.println(" 주 목적 : 호출에 대한 흐름 제어, 반환 결과를 그대로 전달 ");
		
		service1 = new Service();
		
		return service1.runSomething();
	}

}
