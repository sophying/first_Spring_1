package designPattern.designP44;

public class ClientProxy {
	
	public static void main(String[] args) {
		
		//Proxy 를 활용한 호출
		
		IService proxy = new Proxy_1();
		System.out.println(proxy.runSomething());
		
		/*
		   Ram 에 담겨있는 정보를 가져옴. 
		   이미 다녀왔던 위치에 속한 정보를 그대로 가져오는 것을 의미하며,
		   단 어디에서 가져오는지가 달라진다??
		 
		 
		   대리자는 실제 서비스와 같은 이름의 메소드를 구현 함.
		   이 때 인터페이스를 사용 하며, 대리자는 실제 서비스에 대한 참조 변수를 갖게 됨.(합성)
		   대리자는 실제 서비스와 같은 이름을 가진 메소드를 호출하고, 그 값을 Client 에게 반환 함.
		   대리자는 실제 서비스의 메소드 호출 전후에 별도의 로직을 수행할 수 있음. 
		   
		   Proxy Pattern 은 제어의 흐름을 조정하기 위한 목적으로써 대리자를 두는 Pattern 임. 
		   
		 */
	}

}
