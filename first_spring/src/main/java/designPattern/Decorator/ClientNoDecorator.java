package designPattern.Decorator;

public class ClientNoDecorator {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		System.out.println(service.runSomething());
	}
	
	
}
