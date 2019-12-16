package polymorphism;

public class DeawooTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("대우TV---전원 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("대우TV---전원 종료");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("대우TV---볼륨 업");		
	}

	@Override
	public void volumeDown() {
		System.out.println("대우TV---볼륨 다운");		
	}

}
