package displayFunction;

public interface display {
	
	default void display(){
		System.out.println("Hello World!");
	};
}
