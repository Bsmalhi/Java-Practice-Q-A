package displayFunction;

public class PrintDisplay implements display {
	
	public void display(){
		System.out.println("This is PrintDisplay class Display function.");
	}
	
}

class ChildDisplay extends PrintDisplay{
	
	public void print(){
		System.out.println("Child print function");
	}
	
	
}

