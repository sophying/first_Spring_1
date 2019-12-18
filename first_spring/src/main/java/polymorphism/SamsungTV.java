package polymorphism;

import org.springframework.stereotype.Component;

public class SamsungTV implements TV {

	
	private Speaker speaker;
	private int price;
	private int price2;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker; // 외부에서 전달되온 speaker 값을 자신의 멤버 변수에 담음 
		System.out.println(" >  setSpeaker <Apple>  Test ~~~\n");
	}


	public void setPrice(int price) {
		this.price = price;
		System.out.println(" >  ~~~~ setPrice ~~~~~\n");
	}


	public void setPrice2(int price2) {
		this.price2 = price2;
		System.out.println(" >  ~~~~~~~ setPrice2 ~~~~~\n");
	}
	
	// SamsungTV 기본생성자 _ 반드시 있어야 setter 을 활용할 수 있음 
	public SamsungTV( ) {
		
		System.out.println("\n *****[ SamsungTV  Defualt 생성자 ]*****");
	}
	
	
	// SamsungTV 매개변수 생성자 
	public SamsungTV(Speaker speaker) {
	
		System.out.println("SamsungTV speaker 생성자");
		this.speaker = speaker; // 자기 자신의 멤버로 넘겨줌 
	}
	
	// SamsungTV 생성자의 overloading
	public SamsungTV(Speaker speaker, int price) {
		
		System.out.println("SamsungTV speaker / price 생성자");
		this.speaker = speaker; // 자기 자신의 멤버로 넘겨줌
		this.price = price;
	}
	
	// SamsungTV 생성자의 overloading
	public SamsungTV(Speaker speaker, int price,int price2) {
		
		System.out.println("SamsungTV speaker / price 생성자");
		this.speaker = speaker; // 자기 자신의 멤버로 넘겨줌
		this.price = price;
		this.price2 = price2;
	}
	
	
	
	
	
/*	
	// <bean init-method="initMethod">
	public void initMethod() {
		System.out.println("///////객체의 초기화 작업 실행///////");
		
	}
	// <bean destroy-method="destroyMethod">
	public void destroyMethod() {
		System.out.println("///////객체가 삭제되기 직전에 호출!!!");
		
	}
*/	
	
	@Override
	public void powerOn() {
		System.out.println("\nSamsungTV---전원 켠다.(가격 : "+price2+" )");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.\n");
	}
	
	
	public void volumeUp() { // 재정의 
		
		// 호출될 때마다 객체를 생성 함 
		// 만일 AppleSpeaker 로 변경을 하고 싶을 경우 일일이 바꿔줘야 함 
//		speaker = new SonySpeaker();    //->  생성자로 speaker 을 생성하여 받아왔으므로 생성자 필요 없음 
		speaker.volumeUp();
	}
	public void volumeDown() {
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

/*
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
*/
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
