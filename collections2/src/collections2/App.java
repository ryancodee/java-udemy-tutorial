package collections2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList manage arrays internally [0][1][2][3][4][5] ...
		 * use ArrayList generally
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		/*
		 * LinkedList conists of elements where each element has a reference to
		 * the previous and next element [0]->[1]->[2] .. <- <-
		 * use LinkedList if you want to add/remove items at the middle or 
		 * beginning of the list.
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		doThings("ArrayList", arrayList);
		doThings("LinkedList", linkedList);

	}

	private static void doThings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		// add item at the end of the list
		// for(int i=0; i<1E5; i++){
		// list.add(i);
		// }

		// add items elsewhere in the list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

}
