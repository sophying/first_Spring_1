package practice;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("Lg Tv 전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Lg Tv 전원이 꺼졌습니다.");		
	}

	@Override
	public void soundUp() {
		System.out.println("Lg Tv 소리를 올립니다.");		
	}

	@Override
	public void soundDown() {
		System.out.println("Lg Tv 소리를 내립니다.");		
	}
	
	

}
