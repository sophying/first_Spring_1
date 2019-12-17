package polymorphism;

public class LgTV implements TV{
	
	
	// LgTV 생성자 
	public LgTV() {
	
		System.out.println("LgTV 생성자");
		
		
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
	
	
	/*
	 * public void powerOn() { System.out.println("LgTV---전원 켠다.");
	 * 
	 * } public void powerOff() { System.out.println("LgTV---전원 끈다.");
	 * 
	 * } public void volumeUp() { System.out.println("LgTV---소리 올린다.");
	 * 
	 * } public void volumeDown() { System.out.println("LgTV---소리 내린다.");
	 * 
	 * }
	 */
}
