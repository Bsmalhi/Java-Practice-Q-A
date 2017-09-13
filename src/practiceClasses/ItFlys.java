package practiceClasses;

public interface ItFlys{
	public void flys();
}

class FlysA implements ItFlys{

	@Override
	public void flys() {
		System.out.println("I can fly");	
	}
	
}
 class FlysB implements ItFlys{

	@Override
	public void flys() {
		System.out.println("I can't fly");
		
	}
	 
 }