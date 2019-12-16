package practice;

public class TvUser {
	
	public static void main(String[] args) {
		
		/* Design Pattern _Factory */
		
		/*  
		  객체를 생성하기 위한 인터페이스를 정의 함
		  어떤 클래스의 인스턴스를 생성할까??  -  서브클래스에서 결정
		  
		  Factory Class 는 서브 역할을 하게 됨 
		  
		  : getBean() 으로 들어가는 값으로 어떤 인터페이스를 생성할지 결정함
		  
		 */
	
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
