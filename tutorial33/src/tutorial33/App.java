package tutorial33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	// throw exception if the textfile is not found
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// String fileName = "C:\\Users\\Lenovo
		// ThinkCentre\\Documents\\projects\\java\\tutorial33\\example.txt";
		
		// in working directory / root of project
		String fileName = "example.txt";
		File textFile = new File(fileName);

		// open scanner
		Scanner in = new Scanner(textFile);

		int value = in.nextInt();
		System.out.println("Read value: " + value);
		// read \n 
		in.nextLine();

		int count = 2;

		// loop through file contents
		while (in.hasNextLine()) {
			String line = in.nextLine();

			System.out.println(count + ": " + line);
			count++;
		}

		// close scanner or file from the system

		in.close();
	}

}
