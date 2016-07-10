package tutorial49;

public class App {

	// In Java we always pass by value not by reference

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();

		// ---------------------------------------
		int value = 7;
		System.out.println("1. Value is: " + value);

		// passing by value
		app.show(value);
		System.out.println("4. Value is: " + value);

		// ---------------------------------------

		// same outcome as above
		System.out.println();
		Person person = new Person("Bob");
		System.out.println("1. Person is " + person);

		app.show(person);

		System.out.println("4. Person is " + person);

	}

	public void show(int value) {
		System.out.println("2. Value is: " + value);

		// changed for only the scope of the method
		value = 8;

		System.out.println("3. Value is: " + value);
	}

	// method overloading - possible to have methods of the SAME
	// NAME as long as the arguments are different
	// Accepts non-primitive type of arguments (class)
	public void show(Person person) {
		System.out.println("2. Person is " + person);

		// this makes the person supplied as Sue
		// as we refer to the address of the person supplied
		// person.setName("Sue");

		// this is a new person not related to the one supplied
		person = new Person("Mike");

		// this updates mike to sue
		// person.setName("Sue");

		System.out.println("3. Person is " + person);
	}

}
