package tutorial38;

// base class that implements all kinds of machine child classes

// abstract prevents from defining a new Machine(); instance
public abstract class Machine {
	// something in common for all the machines
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// we want every machine to have a method
	// but we dont want machine to implement it as
	// there will be a particular implementation for every
	// type of machine - force child classes to implement them
	public abstract void start(); //like declaration of method in interface
	public abstract void doStuff();
	public abstract void shutDown();
	
	// when to use an abstract class and interface
	// when you make an abstract class you are telling what the 
	// child class is.
	
	// interface example - info interface, a machine class can implement
	// it. A person class can implement it, anything can implement it
	// interface defines one thing that your class can do
	// you can implement many interfaces
	
	
	// a class can implement many interfaces but it can only have
	// one parent class - determines what your child class is
	// one abstract class in hierarchy
	
	// can call the abstract method
	public void run() {
		start();
		doStuff();
		shutDown();
	}
}
