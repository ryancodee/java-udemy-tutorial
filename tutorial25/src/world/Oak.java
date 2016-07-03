package world;

public class Oak extends Plant {
	public Oak() {

		// wont work as type is private
		// type = "tree";
		
		// size is protected so we can access here as this is a
		// subclass of plant
		this.size = "large";
		
		// no access specifier; works bec. Oak and plant is in the same
		// package
		this.height = 10;
	}
}
