package aop001;

import javax.websocket.WebSocketContainer;

public class Start_1 {
	
	public static void main(String[] args) {
		
		Man_1 tom = new Man_1();
		Woman_1 anna = new Woman_1();
		
		tom.runSomething();
		System.out.println("\n\n");
		anna.runSomething();
		
		
		
	}

}
