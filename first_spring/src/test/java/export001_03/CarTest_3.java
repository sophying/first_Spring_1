package export001_03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import export001_03.AmericaTire;
import export001_03.Car_3;
import export001_03.KoreaTire;
import export001_03.Tire;

public class CarTest_3 {
	
	@Test
	public void KoreaTireTest() {
		
		Tire tire1 = new KoreaTire();
		Car_3 car1 = new Car_3();
		
		car1.setTire(tire1);
		
		assertEquals("장착된 타이어 : 코리아타이어", car1.getTireBrand());
	}
	
	@Test
	public void AmericaTireTest() {
		
		Tire tire2 = new AmericaTire();
		Car_3 car2 = new Car_3();
		
		car2.setTire(tire2);
		
		assertEquals("장착된 타이어 : 미국 타이어", car2.getTireBrand());
	}

}
