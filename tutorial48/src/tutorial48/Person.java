package tutorial48;

import java.io.Serializable;

// need to implement serializable to make class serializable
// to write objects to file
public class Person implements Serializable{
	
	// used to check that you are deserializing the object
	// using the same verson of the class
	private static final long serialVersionUID = 4703959944895355743L;
	
	// dont want to serialize, change to transient
	private transient int id;
	private String name;
	
	// has default value as class level
	// field belongs to the class not an individual object
	// no sense of serializing
	private static int count;
	
	public Person() {
		System.out.println("Default constructor");
	}
	
	// being called by new Person with params in writeObjects
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two-argument constructor");
	}

	
	// static to access static field
	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		Person.count = count;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count ;
	}
	
}
