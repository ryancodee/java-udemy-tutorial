package collections7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + ":" + name;
	}
	
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		// sort by length
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		// sort by alphabetical order

		return s1.compareTo(s2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		// sort by reverse alphabetical order
		// by switching the sign to negative

		return -s1.compareTo(s2);
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sorting strings//
		
		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");

		// sort in alphabetical order or natural order
		// Collections.sort(animals);

		// sort using the class created above for length
		// Collections.sort(animals, new StringLengthComparator());

		// sort using the alphabetical order above
		// Collections.sort(animals, new AlphabeticalComparator());

		// reverse alphabetical order
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		
		// sorting numbers //
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(34);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		// sort in numerical order or natural order
		// Collections.sort(numbers);
		
		// pass function in constructor for comparison
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare (Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		// sorting arbitrary objects //
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Claie"));
		people.add(new Person(2, "Sue"));
		
		// does not work as person object has no natural order
//		Collections.sort(people);
		
		// sort in order of id
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
			
		});
		
		for(Person person:people) {
			System.out.println(person);
		}
		
		
		// sort in order of name
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		for(Person person:people) {
			System.out.println(person);
		}
		
	}

}
