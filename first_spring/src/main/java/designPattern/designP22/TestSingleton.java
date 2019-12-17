package designPattern.designP22;

public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton ss1 = Singleton.getInstance();  //  네트워크 연결시 활용됨 
		Singleton ss2 = Singleton.getInstance();
		Singleton ss3 = Singleton.getInstance();

		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		
		ss1 = null;
		ss2 = null;
		ss3 = null;
		
	}
	
	
}
