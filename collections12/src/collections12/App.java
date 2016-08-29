package collections12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Consider:
		 * 1. What you need the collection to do
		 * 2. are you using the fastest collection for your purposes
		 * (think about insertion/deletion, retrieval and traversal)
		 */
		
		///// LIST 
		
		// store lists of objects
		// Duplicates are allowed
		// objects remain in order
		// elements are indexed via an integer
		// cf. shopping list
		// checking for particular item in the list is slow
		// looking an item up by index is fast
		// iterating through lists is relatively fast
		// Note: you can sort lists if you want to.
		
		//if you only add or remove items at the end of lists, use ArrayList
		List<String> list1 = new ArrayList<String>();
		
		// removing or adding items elsewhere  in the list?
		List<String> list2 = new LinkedList<String>();
		
		
		
		//// SETS
		
		// only store UNIQUE values
		// great for removing duplicates
		// not indexed, unlike lists
		// very fast to check if a particular object exists
		// if you want to use your own objects, you must imlpement hashCode() and equals()
		
		// order is unimportant and OK if it changes?
		// HashSet is not ordered.
		Set<String> s1 = new HashSet<String>();
		
		// sorted in natural order? use TreeSet - must implement comparable for custom types
		// 123, abc, etc.
		Set<String> s2 = new TreeSet<String>();
		
		// elements remain in order they were added
		Set<String> s3 = new LinkedHashSet<String>();
		
		
		
		
		/// MAPS
		
		// key value pairs
		// like lookup tables
		// retrieving a value by key is fast
		// iterating over maps is slow
		// maps not optimized for iteration
		// if you want to use your own objects as keys, you must implement hashCode() and equals()
		
		// keys not in any particular order, and order liable to change
		Map<String, String> map1 = new HashMap<String, String>();
		
		// keys sorted in natural order - must implement comparable for custom types (objects)
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// keys remain in order added
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
		// there are also the SortedSet and SortedMap interfaces
		
	}

}
