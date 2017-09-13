package practiceClasses;


public class CreateObject {
	public static void main(String [] args){
		
		Animal doggy = new Dog("jojo");
		System.out.println("Dog name is: " + doggy.getName());
		((Dog)doggy).bark();
		doggy.display();
		Dog n = new Dog("Churoo");
		System.out.println("Dog name is: " + n.getName());
		
		doggy.flyss();
		doggy.setFlyingAbilites(new FlysA());
		doggy.flyss();
		
	}
	
}
