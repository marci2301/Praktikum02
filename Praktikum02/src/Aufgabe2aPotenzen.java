
public class Aufgabe2aPotenzen {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie eine Zahl ein: ");
		int z = StdIn.readInt();
		int p = 1;
		
		for(int i=1; i<=z; i++) {			                        //for-schleife für jede potenz
			p*=2;
			StdOut.println("2 hoch " + i + " ergibt: " +p);
		}
	}
}
