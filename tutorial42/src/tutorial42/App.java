package tutorial42;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	// source > generate hashCode and equals
	// ticked both id and name to compare both and considered equal
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class App {

	public static void main(String[] args) {
		
		// prints the hash
		System.out.println(new Object());
		
		// TODO Auto-generated method stub
		// Person person1 = new Person(5, "Bob");
		// Person person2 = new Person(8, "Sue");

		// point person2 to person1 reference
		// person2 = person1;

		// points to the person object initialised
		// System.out.println(person1 == person2);

		// define set of person with same id and names
		// but 2 different objects
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");

		// use .equals to compare objects with symantic meaning?
		// will result into false, but we can override .equals
		// to show how we want to compare
		System.out.println(person1.equals(person2));

		Double value1 = 7.2;
		Double value2 = 7.2;
		// false
		System.out.println(value1 == value2);
		// true
		System.out.println(value1.equals(value2));

		Integer number1 = 6;
		Integer number2 = 6;

		// true
		System.out.println(number1 == number2);
		// true
		System.out.println(number1.equals(number2));

		String text1 = "Hello";
		// String text2 = "Hello";
		String text2 = "Hellosadawd".substring(0, 5);
		
		System.out.println(text2); // will output comparison to
		// false due to substring
		
		// true as pointing to the exact same object
		// java optimises
		// will return false if we add substring
		System.out.println(text1 == text2);
		
		// always use .equals with strings
		System.out.println(text1.equals(text2));
	}

}
