package aop006;

import org.springframework.stereotype.Component;

/* 스캔할 대상으로 지정하되 해당 클래스의 id 는 man 으로 지정 */
@Component("man")
public class Man_6 implements Person {
	
	public void runSomething() {
		
		System.out.println("열쇠로 문을 열고 집에 들어감");
		
		try {
			System.out.println("치킨을 주문한다");
		} catch (Exception exx) {

			if (exx.getMessage().equals("주문한 음식이 도착")) {
				System.out.println("게임을 멈추고 카드를 찾는다");
				
			}
			
		}finally {
			System.out.println("결제 후 맛있게 치킨을 먹는다");
			
		}
		System.out.println("문을 잠그고 잘 잔다.");
	}

}

