package tutorial37;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// checked exceptions
		// you are forced to handle them
		try {
			Thread.sleep(111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// unchecked exceptions or runtime exceptions
		// you are not forced to handle

		// runtime exceptions are serious errors that you are not
		// likely to recover from that's why its not forcing you
		// to catch it

		// division by 0 - arithmetic exception
		int value = 7;

		value = value / 0;

		// null pointer exception - literally a variable is not
		// referencing anything, easily fixable

		String text = null;

		System.out.println(text.length());

		// array index out of bounds exception
		// not forced to handle it but points to a fundamental
		// problem in your program
		// you can still catch but its not common to do
		String[] texts = { "one", "two", "three" };

		try {
			System.out.println(texts[3]);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
