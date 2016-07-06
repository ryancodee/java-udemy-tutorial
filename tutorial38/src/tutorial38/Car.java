package tutorial38;

public class Car extends Machine{

	// can have whatever set of implementation
	// that would make sense for this particular class
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting car");
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Do stuff in car");
		
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		System.out.println("Shutdown car");
	}

}
