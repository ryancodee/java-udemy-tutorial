package tutorial47;

import java.io.Serializable;

// need to implement serializable to make class serializable
// to write objects to file
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4703959944895355743L;
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
	
}
