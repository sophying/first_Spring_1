package designPattern.Strategy.Study;

public class Client_Study {
	
	public static void main(String[] args) {
		
	// 무기
	Strategy_Study strategy = null;
	// 군인
	Soldier_Study rambo = new Soldier_Study();
	
	
	
	strategy = new StrategyBow_Study();
	rambo.runContext(strategy);
	
	System.out.println();
	
	strategy = new StrategyGun_Study();
	rambo.runContext(strategy);
	
	System.out.println();
	
	
	}

}
