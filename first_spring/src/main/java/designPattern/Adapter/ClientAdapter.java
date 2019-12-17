package designPattern.Adapter;

public class ClientAdapter {
	
	public static void main(String[] args) {
		
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		asa1.runService();
		asb1.runService();
		
	}
	

}
