package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("\n******[ AppleSpeaker 객체 생성 ]******");
	}
	@Override
	public void volumeUp() {
		System.out.println("----[ AppleSpeaker영역 ]---- AppleSpeaker Volume Up ");
	}

	@Override
	public void volumeDown() {
		System.out.println("----[ AppleSpeaker영역 ]---- AppleSpeaker Volume Down ");
		
	}

}
