package collections5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		// set - stores unique elements
		// HashSet does not retain order
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order
		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
		
		// check if empty
		if(set1.isEmpty()) {
			System.out.println("set is empty");
		}

		// insert into set
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// add duplicate items does nothing
		set1.add("mouse");

		System.out.println(set1);
		
		// check if empty
		if(set1.isEmpty()) {
			System.out.println("set is empty");
		}

		
		
		// iterate
		for(String element: set1) {
			System.out.println(element);
		}
		
		// does set contain a given item
		// sets are optimized to find an item quickly
		
		if(set1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		
		// set2 contains some common elements with set1, and some new
		
		Set<String> set2 = new TreeSet<String>();
		

		// insert into set
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		
		//intersection
		// creates copy of set1 in intersection
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		// keep all elements common between set1 and set2
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		//difference
		// not in set2 
		Set<String> difference = new HashSet<String>(set2);
		
		difference.removeAll(set1);
		
		System.out.println(difference);
	}
}
