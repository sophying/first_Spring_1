package designPattern.Singleton;

public class SingletonTester {
	
	public static void main(String[] args) {
		
		SingletonStudy single1 = SingletonStudy.getInstance();
		SingletonStudy single2 = SingletonStudy.getInstance();
		
		System.out.println(single1);
		System.out.println(single2);
		
		single1 = null;
		single2 = null;
	}

}
