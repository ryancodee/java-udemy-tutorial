package tutorial44;

// enum - fixed set / fixed values
// defined like a class with enum type
public enum Animal {
	// CAT, DOG, and MOUSE are objects of type Animal
	// CAT, DOG, MOUSE;
	
	// need to supply params via ()
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	// can give enum instance data
	private String name;

	// can give constructor
	// can be supplied params
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "this animal is called " + name;
	}
	
	
}
