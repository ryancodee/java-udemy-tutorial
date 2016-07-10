package tutorial46;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing objects..");
		
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		// writes into file
		try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			// automatically calls fs.close
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			// pass one of the objects declared
			os.writeObject(mike);
			os.writeObject(sue);
			
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
