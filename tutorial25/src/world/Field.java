package world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		// field is in the same package as plant so we can access
		// size here
		System.out.println(plant.size);
	}
}
