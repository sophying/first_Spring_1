package designPattern.designP66;

public abstract class Animal {
	
	/*
		Interface  : 모두다 추상
		abstract : 추상 + 일반메소드 
    */
	
	// 템플릿 메소드
	public void playWithOwner() {
		
		System.out.println("봄이야 이리와~!");
		play();          // 추상
		runSomething(); // 일반
		System.out.println("아이구 예뻐라 봄이");
	}
	
	
	// 추상 메소드 _재정의가 무조건 되어야만 객체화 가능 
	abstract void play();
	
	// Hook Method
	void runSomething() {
		System.out.println("--- 꼬리를 살랑살랑 ---");
	}
	// 멤버 메소드 : override
	// 멤버 변수 : 쉐도잉 
}
