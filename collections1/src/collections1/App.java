package collections1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// need to use object type of the primitive type i.e int is Int
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// add values to arraylist
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// retrieve
		System.out.println(numbers.get(0));
		
		//iterate over items in arraylist
		// .size method to get size of arraylist
		System.out.println("\nIteration 1");
		for(int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// remove items in the list
		numbers.remove(numbers.size() - 1);
		
		// very slow
		numbers.remove(0);
		
		// another way to iterate
		System.out.println("\nIteration 2");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		

		// ArrayList imlements List interface
		
		List<String> values = new ArrayList<String>();
		
	}

}
