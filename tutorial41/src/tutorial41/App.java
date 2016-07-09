package tutorial41;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		// very similar to reading files
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			// will handle closing br
			// no need to call br.close() automatically
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("Last line");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't find file " + file.toString());
		} 
	}

}
