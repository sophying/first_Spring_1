package polymorphism;

public class SamsungTV implements TV {

	
	// SamsungTV 생성자 
	public SamsungTV() {
	
		System.out.println("SamsungTV 생성자");
	}
	
	// <bean init-method="initMethod">
	public void initMethod() {
		System.out.println("///////객체의 초기화 작업 실행///////");
		
	}
	// <bean destroy-method="destroyMethod">
	public void destroyMethod() {
		System.out.println("///////객체가 삭제되기 직전에 호출!!!");
		
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}

	/*
	 * public void powerOn() { System.out.println("SamsungTV---전원 켠다.");
	 * 
	 * } public void powerOff() { System.out.println("SamsungTV---전원 끈다.");
	 * 
	 * } public void volumeUp() { System.out.println("SamsungTV---소리 올린다.");
	 * 
	 * } public void volumeDown() { System.out.println("SamsungTV---소리 내린다.");
	 * 
	 * }
	 */

}
