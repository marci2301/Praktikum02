
public class Aufgabe2de_Teiler {

	public static void main(String[] args) {
		
		
	
		while(true) {
			
			StdOut.println("Geben Sie eine Zahl ein: ");
			int z = StdIn.readInt();
			
			for(int i=1; i<z; i++) {
				if(z%i == 0) {
					StdOut.println(i + " ist ein Teiler von " +z);
				}
			}
		}
	}
}
