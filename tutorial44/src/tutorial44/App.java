package tutorial44;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialise enum
		Animal animal = Animal.CAT;
		
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
		
		System.out.println(Animal.DOG); // DOG
		// return actual name of the enum constants
		System.out.println("Enum name as a string " + Animal.DOG.name());
		
		System.out.println(Animal.DOG.getClass()); // Animal
		
		System.out.println(Animal.DOG instanceof Animal); // true
		
		System.out.println(Animal.DOG instanceof Enum); // true
		
		System.out.println(Animal.MOUSE.getName());
		
		// valueof turns to enum constant
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}

}
