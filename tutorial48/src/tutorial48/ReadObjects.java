package tutorial48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		
		// read bin file created
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {
			
			Person person = (Person) os.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
