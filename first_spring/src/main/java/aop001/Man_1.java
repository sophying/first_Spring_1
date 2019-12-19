package aop001;

public class Man_1 {
	
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
