package designPattern.Strategy;

public class Client_1 {
	
	public static void main(String[] args) {
		
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		// 총을 람보에게 전달하여 전투에 투입
		strategy = new StrategyGun();
		rambo.runContext(strategy);
		
		System.out.println();
		
		// 칼을 람보에게 전달하여 전투에 투입
		strategy = new StrategySword();
		rambo.runContext(strategy);
		
		System.out.println();
		
		// 활을 람보에게 전달하여 전투에 투입
		strategy = new StrategyBow();
		rambo.runContext(strategy);
		
		System.out.println();
		
		// 창을 람보에게 전달하여 전투에 투입
		strategy = new StrayChang();
		rambo.runContext(strategy);
		
		System.out.println();
		
	}

}
