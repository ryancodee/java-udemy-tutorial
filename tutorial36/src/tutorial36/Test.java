package tutorial36;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	// can add multiple throws exception separated by comma 
	public void run() throws IOException, ParseException {
		//throw new IOException();
		
		throw new ParseException("Error in command list", 2);
	}
	
	public void input() throws IOException, FileNotFoundException{
		
	}
}
