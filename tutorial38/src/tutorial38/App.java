package tutorial38;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camera cam1 = new Camera();
		cam1.setId(5);

		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		
		// cant do this as the Machine is an
		// abstract class
		// Machine machine1 = new Machine();
		
	}

}
