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
		 
		 */
	}

}
