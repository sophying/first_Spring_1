package designPattern.Decorator;

public class ClientDecorator {

	public static void main(String[] args) {
		
		IService decoreator = new Decorator();
		System.out.println(decoreator.runSomething());
	}
}
