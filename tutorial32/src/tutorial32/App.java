package tutorial32;

class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

interface Plant {
	public void grow();
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// anonymous class when putting {} after init
		Machine machine1 = new Machine() {
			// child class of Machine that doesn't have a name
			// can override methods here
			@Override public void start() {
				System.out.println("Camera snapping...");
			}
		};
		
		machine1.start();
		
		// anonymous interface
		Plant plant1 = new Plant() {
			
			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant growing");
			}
		
			
		};
		
		plant1.grow();
	}

}
