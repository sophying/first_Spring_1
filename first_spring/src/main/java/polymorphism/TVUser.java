package polymorphism;

public class TVUser {

		public static void main(String[] args) {
//			SamsungTV tv = new SamsungTV();
//			LgTV tv = new LgTV();
			
//			TV tv = new LgTV();
//			TV tv = new SamsungTV();
//			TV tv = new DeawooTV();
	
/*  BeanFactory 생성 _Design Pattern */
			
/* TVUser  >  Run As  > Run Configurations >  Arguments  > Program arguments */  	
			
			BeanFactory factory = new BeanFactory();
			
			TV tv = (TV) factory.getBean(args[0]);
			
			tv.powerOn();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeUp();
			tv.volumeDown();
			tv.volumeDown();
			tv.powerOff();
			
			
		}
}
