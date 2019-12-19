package export005;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("tire22")
//	@Resource(name="tire11")
	Tire tire;
	
	public String getTireBrand() {
		
		return "장착된 타이어 : " +tire.getBrand();
	}

}

// @Autowired  :  type 먼저 찾고 name 으로 찾음
// @Resource : 먼저 찾고 type 찾음