package designPattern.designP66;

public class Cat extends Animal {
//  추상 메소드가 재정의 되지 않으면 Dog Class 도 추상으로 남게됨 객체화 될 수 없음
	@Override
	void play() {

		System.out.println("은하수가 야옹야옹~");
	}
	
/*	
	void runSomething() {
		System.out.println("그르렁 그르렁 부비부비");
	}
*/
}
