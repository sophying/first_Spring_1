package designPattern.designP44;

public class ClientNoProxy {
	
	public static void main(String[] args) {
		
		// Proxy 를 이용하지 않은 호출 예시 
		
		Service service = new Service();
		
		System.out.println(service.runSomething());
		
	}

}
