public class Aufgabe1dQuadratLeer {
	
	public static void main(String[] args) {
		
		StdOut.println("Anzahl der Zeilen eingeben: ");
		int z = StdIn.readInt();
		
		for(int i=0; i<z; i++){
			StdOut.print("*");
		}
		StdOut.println("");		
		
		for(int i=0; i<(z-2); i++){
			StdOut.print("*");
			for(int j=0; j<(z-2); j++){
				StdOut.print(" ");			
			}
			StdOut.println("*");		
		}
		
		for(int i=0; i<z; i++){
			StdOut.print("*");
		}
	}
}
