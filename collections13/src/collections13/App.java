package collections13;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	
	public static String[] vehicles = {
		"ambulance", "helicopter", "lifeboat"	
	};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob"},
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Set<String>> personel = new HashMap<>();
		
		for(int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>();
			
			for(String driver: driversList) {
				driverSet.add(driver);
			}
			
			// add set of drivers to vehicles
			personel.put(vehicle, driverSet);
		}
		
		// close it its own scope so we can use driverslist variable below
		{	// example usage
			Set<String> driversList = personel.get("helicopter");
			
			for(String driver: driversList) {
				System.out.println(driver);
			}
		}
		
		
		// iterate through the whole thing
		for(String vehicle: personel.keySet()) {
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driversList = personel.get(vehicle);
			
			for(String driver: driversList) {
				System.out.print(driver);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}
