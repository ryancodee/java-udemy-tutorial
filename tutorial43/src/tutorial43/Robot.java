package tutorial43;

public class Robot {
	private int id;
	
	// inner classes are used when you need to group
	// some functionality and you need the inner 
	// class to have access to the instance variables
	// private inner class
	private class Brain {
	
	// public inner class
	// public class Brain {
			
		// this will have access to instance
		// data of the robot class
		
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
		

	// static inner classes
	// used for grouping classes together and you don't want
	// it associated with the instances of the outer class
	// but you want to group it with the other class
	public static class Battery {
		public void charge() {
			// cant refer to instance variable above
			// unless its a static variable
			System.out.println("Battery charging....");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		//creates an instance of the inner class
		Brain brain = new Brain();
		brain.think();
		
		// can be refered to by method in 
		// inner class if its final 
		final String name = "Robert";
		
		// can also declare classes within methods
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id); // instance
				// data can be refered just fine
				System.out.println("My name is  " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
