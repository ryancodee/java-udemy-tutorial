package tutorial25;

import world.Plant;

public class Grass extends Plant {
	public Grass() {

		// not gonna work - height has no access modifier
		// not in the same package as plant even if subclass
		// System.out.println(this.height);
	}
}
