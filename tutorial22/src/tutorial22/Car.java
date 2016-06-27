package tutorial22;

public class Car extends Machine{
	// child class of machine; Machine is parent class
	// Car inherits from Machine;
	
	// override method from parent class
	// public void start() {
	// System.out.println("Car Started");
	// }
	
	
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	// better way to override a method 
	// right click + source + Override/Implement methods
	@Override // annotation; also a class name
	public void start() {
		System.out.println("Car Started");
	}
	
	// name variable is not visible from the parent class
	// because it is private
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
