package tutorial39;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// old way of reading files
		
		// File class doesn't provide a way to read files
		// just store the file in a new instance
		File file = new File("test.txt");
		
		// will try to open the file; but will throw exception
		// if it cant open it
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			
			// buffer reads the line
			// closing br closes everything above it (fr, file)
			// since its opening fr and fr opens file
			br = new BufferedReader(fr);
			
			String line;
			
			// line = br throws IOException
			while( (line = br.readLine()) != null ) {
				System.out.println(line);
			};
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		} finally {
			// finally will be executed everytime even
			// exceptions are thrown
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// File was probably never opened
			}
		}

	}

}
