package collections11;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		URLlibrary urlLibrary = new URLlibrary();
		
		for(String html: urlLibrary) {
			System.out.println(html.length());
			System.out.println(html);
		}
		
	}

}
