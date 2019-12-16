package polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {

		if (beanName.equals("samsung")) {
			return new SamsungTV();
			
		} else if (beanName.equals("lg")) {
			return new LgTV();
			
		} else if (beanName.equals("deawoo")) {
			return new DeawooTV();
			
		}
		
		return null;
	}

}
