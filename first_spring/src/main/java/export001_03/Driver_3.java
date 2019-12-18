package export001_03;

public class Driver_3 {
	public static void main(String[] args) {
		
		
		Tire tire = new KoreaTire();
		
		Car_3 car = new Car_3();
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
