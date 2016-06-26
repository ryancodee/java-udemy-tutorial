package tutorial18;

class Machine {
	private String name;
	private int code;
	
	// constructor doesn't have a return type even void
	// it always run when you init an instance of the class
	public Machine() {
		
		// call more complex constructor below
		// this is this constructor in this class which has 2 params
		// calling the constructor inside a constructor should
		// always be the first line
		this("Arnie", 0);
		
		
		System.out.println("Constructor running");
		

	}
	
	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Bertie");

		Machine machine3 = new Machine("Chalky", 7);
	}

}
