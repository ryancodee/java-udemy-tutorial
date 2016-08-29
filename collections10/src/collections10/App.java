package collections10;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// list implements the iterable inteface
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		// hasnext checks if there's next
		while(it.hasNext()) {
			// returns the next item
			String value = it.next();
			
			System.out.println(value);
			
			if (value.equals("cat")) {
				it.remove();
			}
		}
		
		
		System.out.println();
		
		
		// modern iteration, java 5 and later
		// for still does the above
		for(String animal: animals) {
			System.out.println(animal);
		}
	}

}
