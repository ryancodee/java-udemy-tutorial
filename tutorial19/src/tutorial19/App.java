package tutorial19;


class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	
	// instance variables
	// each object can get a copy
	public String name;
	
	// static only belongs to the class unlike other variables
	// where you can do thing1 and  thing2
	// there is only one copy per class; also called class variables
	public static String description;
	
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		
		count++;
	}
	
	// instance method
	// this can access the static variables
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
		
	}
	
	// static methods can be accessed by the class only
	// can't output instance variables
	public static void showInfo() {
		System.out.println(description);
		// this wont work as the object is not defined yet
		// can't access instance variables
		// System.out.println(name);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thing.description = "I am a thing";
		
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		
		Thing thing2 = new Thing();
		
		
		System.out.println("After creating objects, count is: " + Thing.count);

		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		// Math.PI = 3; can't assign to a constant
		
		
		// constants are by convention all caps
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
