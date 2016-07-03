package tutorial26;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant1 = new Plant();

		// subclass of plant
		Tree tree = new Tree();

		// reference points to plant1 object
		Plant plant2 = tree;

		// will use grow method in tree
		plant2.grow();

		tree.shedLeaves();

		// cant access shedLeaves
		// as the type of variables decide what methods get
		// called with - plant2 is a Plant variable not a tree
		// plant2.shedLeaves();
		
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
