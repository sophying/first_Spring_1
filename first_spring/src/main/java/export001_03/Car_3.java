package export001_03;

public class Car_3 {
	
	Tire tire;

	//getter
	public Tire getTire() {
		return tire;
	}

	//setter
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	 
	
	public String getTireBrand() {
		
		return "장착된 타이어 : " + tire.getBrand();
	}

}
