package aop003;

public class Woman_3 implements Person{
	
	public void runSomething() {
		
		System.out.println("열쇠로 문을 열고 집에 들어감");
		
		try {
			System.out.println("요리를 함");
		} catch (Exception exx) {

			if (exx.getMessage().equals("오븐 속 오리 구이가완료 되었다.")) {
				System.out.println("달려가 가져온다");
			}
		}finally {
			System.out.println("바로 잔다");
		}
		System.out.println("문을 잠그고 잘 잔다.");
	}

}
