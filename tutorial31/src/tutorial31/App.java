package tutorial31;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I'm a machine";
	}
	
	public void start() {
		System.out.println("Machine starting..");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I'm a camera";
	}
	
	public void snap(){
		System.out.println("Snap!");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		showList(list1);
		
		// array of child class type is not a subclass of the 
		// same parameratised class
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		showList2(list1);
	}
	
	// ? = wildcard; ArrayList of unknown type
	// can now pass any type of array list params
	// can extend object
	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value: list) {
			System.out.println(value);
			value.start(); // calls machine method when calling camera
		}
	}

	// upper bounds
	public static void showList2(ArrayList<? super Camera> list) {
		for(Object value: list) {
			System.out.println(value);
		}
	}
	
	public static void showList3(ArrayList<?> list) {
		for(Object value: list) {
			System.out.println(value);
		}
	}
}
