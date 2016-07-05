package tutorial36;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	// public static void main(String[] args) throws IOException, ParseException
	// {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();

		// 1
		// exception being thrown from method declaration
		// would also be thrown when it is called from main
		// test.run();

		// 2
		// normal catch block
		// throws exception depending on what error is encountered
		 try {
		 test.run();
		 } catch (IOException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 } catch (ParseException e) {
		 // TODO Auto-generated catch block
		 System.out.println("couldn't parse command file.");
		 }

		// 3
		// multi catch block - introduced in java 7
		 try {
		 test.run();
		 } catch (IOException | ParseException e) {
		 // lists multiple exceptions
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		
		
		// catch with parent class exception
		// to catch whatever exception is thrown
		// polymorphism - call parent class where a child class 
		// is defined
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		try {
			test.input();
		// need to have filenotfound first
		// as ioexception catches all (parent of filenotfound)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
