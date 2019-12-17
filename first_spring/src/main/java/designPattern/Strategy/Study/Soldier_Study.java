package designPattern.Strategy.Study;

public class Soldier_Study {
	

	
	void runContext(Strategy_Study strategy) {
		
		System.out.println("전쟁이다!!");
		
		strategy.runStrategy();
		
		System.out.println("승리다!!!");
	}

}
