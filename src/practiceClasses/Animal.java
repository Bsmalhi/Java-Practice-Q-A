package practiceClasses;

public class Animal {
	private String name;
	public ItFlys ans ; // we can create reference variable of interface
	
	public void flyss(){
		 ans.flys();
	}
	
	public void display(){
		System.out.println("Do something like bark or run or eat.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setFlyingAbilites(ItFlys setfly){
		ans = setfly;
	}
	
	
}
