package tutorial25;

import world.Plant;

/*
 * private -- only within same class
 * public -- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier -- same package only
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();

		System.out.println(plant.name);
		System.out.println(plant.ID);

		// type is private
		// System.out.println(plant.type);

		// won't work as size is protected and App is not in the
		// same package as plant
		// System.out.println(plant.size);

		// wont work as App and Plant are in diff packages.
		// height has package level visibility
		// System.out.println(plant.height);

	}

}
