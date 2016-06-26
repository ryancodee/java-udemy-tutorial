package tutorial17;

class Frog {
	// set to private to enforce encapsulation
	// only methods in class has access to instance variables
	private String name;
	private int age;

	public void setName(String name) {
		// name is local variable in the method (params)
		// this.name is the instance variable declared in the class
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog1 = new Frog();

		// cant do this anymore if instance variables
		// are private
		// frog1.name = "Bertie";
		// frog1.age = 1;

		frog1.setName("Bertie");
		frog1.setAge(1);

		System.out.println(frog1.getName());

	}

}
