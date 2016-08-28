package collections9;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	public static void main(String[] args) {
		// front of queue = head - elements would leave here
		// end of queue = tail - we add elements here
		// first in first out - first item added would be first item removed

		// ArrayBlockingQueue can have a fixed size unlike list
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// Throws no such element execption = no item in queue yet
		// System.out.println("Head of the queue is: " + q1.element());

		q1.add(10);
		q1.add(20);
		q1.add(30);

		System.out.println("Head of the queue is: " + q1.element());

		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items in the queue");
		}

		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}

		// removes head of the queue
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from the queue");
		}
		
		////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		// returns null if no items yet in head of the queue
		System.out.println("Queue 2 peek: " + q2.peek());

		q2.offer(10);
		q2.offer(20);
		
		// offer returns false if trying to add above the queue count
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to add third item");
		}
		
		for (Integer value : q2) {
			System.out.println("Queue 2 value: " + value);
		}
		
		// remove item from queue
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll()); // returns null 3rd time as we have just 2 items
	
	
	}
}
