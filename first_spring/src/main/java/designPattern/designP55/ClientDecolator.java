package designPattern.designP55;

public class ClientDecolator {

	public static void main(String[] args) {
		
		IService decoreator = new Decolator();
		System.out.println(decoreator.runSomething());
	}
}
