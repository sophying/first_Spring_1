package export004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	// setter 로 값을 담는 것이 아닌 어노테이셔ㅕㄴ Autowired 로 담음 
	@Autowired
	Tire tire;
/*	
	@Autowired 을 통해 car 의 property 를 자동으로 엮어 줄 수 있으므로
	(자동 의존성 주입) 생략 가능
*/	
	public String getTireBrand() {
		
		return "장착된 타이어 : " +tire.getBrand();
		
	}

}
