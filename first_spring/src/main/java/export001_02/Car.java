package export001_02;

public class Car {
	
	Tire tire;
	
	// 매개변수가 있는 생성자 ( 매개변수를 통해 객체를 전달 받음 )
	public Car(Tire tire) {
		
		this.tire =  tire;
		
	}
	
	public String getTireBrand() {
		
		return"장착된 타이어 : "+tire.getBrand();
	}

}
