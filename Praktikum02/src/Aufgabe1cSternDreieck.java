
public class Aufgabe1cSternDreieck {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie die Anzahl der Zeilen ein: ");
		int z = StdIn.readInt();
		
		for(int i=0; i<=z; i++){
			for(int j=0; j<i; j++){
				StdOut.print("*");
			}
			StdOut.println("");
		}
	}
}
