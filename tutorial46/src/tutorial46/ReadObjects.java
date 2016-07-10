package tutorial46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// serialization - turning an object into a binary data
		
		// de-serialize - binary to object
		
		System.out.println("Reading objects..");
		
		// read bin file created
		try(FileInputStream fi = new FileInputStream("people.bin")) {
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			// need to case to particular kind of object
			Person person1 = (Person) os.readObject();
			Person person2 = (Person) os.readObject();
			
			os.close();
			
			System.out.println(person1);
			System.out.println(person2);
			
			
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
