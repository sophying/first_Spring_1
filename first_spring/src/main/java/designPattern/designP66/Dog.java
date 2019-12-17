package designPattern.designP66;

public class Dog extends Animal {
//  추상 메소드가 재정의 되지 않으면 Dog Class 도 추상으로 남게됨 객체화 될 수 없음
	@Override
	void play() {

		System.out.println("봄이가 달려온다!");
	}
	
	void runSomething() {
		System.out.println("월!! 월!!!  꼬리 살랑살랑 ");
	}

}
