package tutorial20;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// strings are immutable in java; cannot change it
		
		 //inefficient
		 String info = "";
		
		 // creating a new string and reassigning
		 info += "My name is Bob.";
		
		 // creating a new string and adding the space
		 info += " ";
		 info += "I am a builder.";
		
		 System.out.println(info);
		
		
		 // string builder modifies the contents of the existing
		 // string builder; appends;
		 // more efficient in terms of memory
		 StringBuilder sb = new StringBuilder("");
		 sb.append("My name is Sue.");
		 sb.append(" ");
		 sb.append("I am a lion tamer.");
		 
		 System.out.println(sb.toString());
		
		 
		 // method chaining for string builder		 
		 StringBuilder s = new StringBuilder();
		 s.append("My name is Roger.")
		 	.append(" ")
		 	.append("I am a skydiver.");
		 
		 System.out.println(s.toString());
		 
		 ////// formatting /////////
		 
		 System.out.print("Here is some text. \tThat was a tab. \nThat was a new line.");
		 System.out.println("More text");
		 
		 // formating integers
		 System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
		 
		 for (int i=0; i < 20; i++) {
			 System.out.printf("Output %-2d: %s\n", i, "some text here");
		 }
		 
		 // formatting floating point values
		 System.out.printf("Total value: %.2f\n", 5.5758);
		 System.out.printf("Total value: %-5.1f\n", 125.5758213123);
		 
	}

}
