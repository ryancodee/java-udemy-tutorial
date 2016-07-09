package tutorial40;

class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing");
		throw new Exception("Oh no!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// old way
		// Temp temp = new Temp();
		//
		// try {
		// temp.close();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		
		// Java 6 onwards
		// try with resources
		// automatically calls close
		try(Temp temp = new Temp()) {
			// calls close here
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
