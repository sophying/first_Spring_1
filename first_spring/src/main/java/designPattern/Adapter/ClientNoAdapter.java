package designPattern.Adapter;

public class ClientNoAdapter { // Adapter 을 활용하지 않았을 경우
	
	public static void main(String[] args) {
		
		ServiceA sa1 = new ServiceA();
		ServiceB sa2 = new ServiceB();
		
		sa1.runServiceA();
		sa2.runServiceB();
	}

}
