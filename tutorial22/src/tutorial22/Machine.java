package tutorial22;

public class Machine {

	// this can only be accessed here in this class - private
	// cannot be accessed from child class if it is "private"

	// private String name = "Machine Type 1";
	
	
	// protected can be accessed by child classes
	protected String name = "Machine Type 1";

	public void start() {
		System.out.println("Machine Started");
	}

	public void stop() {
		System.out.println("Machine Stopped");
	}
}
