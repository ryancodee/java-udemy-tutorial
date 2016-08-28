package collections4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keys and values not stored in order
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// keys and values stored in order you inserted them to the map
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// natural order 1,2,3,4,5 abcd sorted keys
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "dog");
		map.put(8, "cat");
		map.put(1, "giraffe");
		map.put(15, "swan");
		map.put(6, "bear");
		map.put(7, "snake");
		
		// more efficient way to get key map.keyset and loop
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
