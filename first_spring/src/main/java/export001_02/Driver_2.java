package export001_02;

public class Driver_2 {
	
	public static void main(String[] args) {
		
		// Driver 에서 객체를 생성하여  Car 객체로 전달 
		Tire tire = new KoreaTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
		
		
	}

}
