package designPattern.TemplateMethod;

public class Driver_1 {

	public static void main(String[] args) {
		
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		bolt.playWithOwner();
		
		System.out.println();
		System.out.println();
		
		kitty.playWithOwner();
		
	}
}
