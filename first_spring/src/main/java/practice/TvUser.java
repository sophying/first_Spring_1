package practice;

public class TvUser {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new BeanFactory();
		
		Tv tv = (Tv) factory.getBean(args[0]);
		
		tv.powerOn();
		tv.soundUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.soundDown();
		tv.soundDown();
		tv.powerOff();
		
		
	}

}
