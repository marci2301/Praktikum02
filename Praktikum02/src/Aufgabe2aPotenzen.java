
public class Aufgabe2aPotenzen {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie eine Zahl ein: ");
		int z = StdIn.readInt();
		int p = 1;
		
		for(int i=1; i<=z; i++) {			
			p*=2;
			StdOut.println("2 hoch " + i + " ergibt: " +p);
		}
	}
}
