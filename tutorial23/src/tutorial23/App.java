package tutorial23;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mach1 = new Machine();
		
		mach1.start();
		
		Person person1 = new Person("Bob");
		
		person1.greet();
		
		// can init interface to new object that extends it
		Info info1 = new Machine();
		
		// can access method defined from class
		info1.showInfo();
	
		// point reference to existing person object
		Info info2 = person1;
		
		info2.showInfo();
		
		// can call private method below that accepts interface 
		// as params
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	// private method that accepts interface
	// calls showInfo() of the interface 
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
