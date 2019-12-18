package export001_01;

public class Car {
	
	Tire tire;
	
	public Car() {

		// 객체를 만들어서 전달 함 
		tire = new AmericaTire();
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어 : " + tire.getBrand();
	}

}
