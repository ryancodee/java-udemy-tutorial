package world;

public class Plant {
	public String name;

	
	// Acceptable practice -- its final
	public final static int ID = 8;
	
	// private -you can only access from w/in this class
	private String type;
	
	// protected you can access w/in the class and child classes
	protected String size;
	
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}
	
}
