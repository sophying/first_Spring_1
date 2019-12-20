package aop006;

import org.springframework.stereotype.Component;

/* 스캔할 대상으로 지정하되 해당 클래스의 id 는 woman 으로 지정 */
@Component("woman")
public class Woman_6 implements Person{
	
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
