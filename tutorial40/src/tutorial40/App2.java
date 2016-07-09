package tutorial40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("test.txt");
		
		// old way
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
		
		// other way/ java 6 onwards
		// supply initialisation for filereader directly
		// inside init of buffered reader
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			
			// line = br throws IOException
			while( (line = br.readLine()) != null ) {
				System.out.println(line);
			};
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file " + file.toString());
		}

		
		
	}

}
