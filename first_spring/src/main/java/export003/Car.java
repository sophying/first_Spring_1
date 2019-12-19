package export003;

public class Car {

	Tire tire;

	public Tire getTire() {
		return tire;
	}

	// xml 에서 property 를 통해 값을 가져옴 
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어 : " + tire.getBrand();
	}
	
	
}
