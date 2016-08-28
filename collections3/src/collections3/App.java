package collections3;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hashmap is not sorted in anyway
		// does not maintain order
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//insert to map (key, value)
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(4, "Four");
		map.put(2, "Two");
		
		// overrides the first key value pair with a duplicate key
		map.put(6, "Hello");
		
		// get value by passing the key
		String text = map.get(4);
		
		System.out.println(text);
		
		
		//iterate over map
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " +value);
		}
		
	}

}
