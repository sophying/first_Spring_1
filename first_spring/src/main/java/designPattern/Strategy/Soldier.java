package designPattern.Strategy;

public class Soldier {
	
	void runContext(Strategy strategy) {
		
		System.out.println("  나를 따르라!!!!!!! 살고자 하면 죽을 것이고 죽고자하면 살 것이다.");
		strategy.runStrategy();
		
		System.out.println(" 승리하였다!");
	}

}
