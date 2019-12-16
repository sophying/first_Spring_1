package practice;

public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("Samsung Tv 전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung Tv 전원이 꺼졌습니다.");		
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung Tv 소리를 올립니다.");		
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung Tv 소리를 내립니다.");		
	}
	
	

}
