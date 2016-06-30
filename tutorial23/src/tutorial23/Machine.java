package tutorial23;

// classes can implement multiple interfaces
// but can only extend one other class
public class Machine implements Info{
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine Started!");
	}
	
	
	// add unimplemented method from error above from when class
	// implemented interface
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine ID is: " + id);
	}
}
