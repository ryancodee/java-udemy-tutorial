package tutorial45;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int value = 4;

		// factorial of 4
		// E.g 4! = 4*3*2*1
		System.out.println(factorial(1));
	}

	private static int factorial(int value) {

		// System.out.println(value);

		// calling method within the method
		// will get stack overflow error

		// add if to stop recursion
		// return to break from recursive loop
		if (value == 1) {
			return 1;
		}
		
		// all the values are stored in the stack
		return factorial(value - 1) * value;
	}

}
