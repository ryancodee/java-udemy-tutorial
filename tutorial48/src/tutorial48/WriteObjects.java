package tutorial48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {

		// writes into file
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
			// automatically calls fs.close
			
			// since id is transient, its not been serialize
			// will be default or 0
			Person person = new Person(7, "Bob");
			
			// use the class to access static methods not the
			// object initialized
			// will set count to 88 for all objects of that class
			Person.setCount(88);
			
			os.writeObject(person);
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
