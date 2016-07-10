package tutorial47;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing objects..");
		
		// arrays are serializable as long as the objects
		// inside are serializable
		Person[] people = {new Person(1, "Sue"), new Person(9, "Mike"), new Person(7, "Bob")};
		
		// serialze the array list
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		// writes into file
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			// automatically calls fs.close
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			
			os.writeObject(peopleList);
			
			// serialize one object at a time
			// get size of list
			os.writeInt(peopleList.size());
			
			for (Person person: peopleList) {
				os.writeObject(person);
			}
			
			// close manually
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
