package polymorphism;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//@Resource(name="sony")
	
	//@Inject
	//@Qualifier("apple")

	@Autowired
//	@Qualifier("sony")
	private Speaker speaker;
	
	
	// LgTV 생성자 
	public LgTV() {
	
		System.out.println("LgTV 생성자");
		
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	
	/*
	 * public void powerOn() { System.out.println("LgTV---전원 켠다.");
	 * 
	 * } public void powerOff() { System.out.println("LgTV---전원 끈다.");
	 * 
	 * } public void volumeUp() { System.out.println("LgTV---소리 올린다.");
	 * 
	 * } public void volumeDown() { System.out.println("LgTV---소리 내린다.");
	 * 
	 * }
	 */
}
