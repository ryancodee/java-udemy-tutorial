package tutorial27;

// encapsulation - encapsulate the inner workings of a class
// just expose the things you need;


// make everything private as you can
class Plant {
	// usually instance variables are private
	private String name;
	
	// you can do public if it is static/final
	public static final int ID = 7;

	
	// this is exposed, but using a private method calculateGrowth..
	public String getData() {
		String data = "Some stuff" + calculateGrowthForecast();
		
		return data;
	}
	
	// private as the class is only the one using it
	private int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
