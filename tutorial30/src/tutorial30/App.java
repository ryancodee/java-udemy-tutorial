package tutorial30;

import java.util.ArrayList;
import java.util.HashMap;

// generic class is a class that can work with other objects

class Animal {
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//// before Java 5 //////
		ArrayList list = new ArrayList();
		
		list.add("apply");
		list.add("banana");
		list.add("orange");
		
		// need to downcast as list returns an object
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		/////// Modern Style //////
		
		//base type string
		
		// returns not a method but the type you mentioned in the 
		// diamond bracket
		ArrayList<String> strings = new ArrayList<String>();
	
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		
		//// there can be more than one type argument /////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		///// Java 7 Style ////
		// can remove the params in the new part
		ArrayList<Animal> someList = new ArrayList<>();
	}

}
