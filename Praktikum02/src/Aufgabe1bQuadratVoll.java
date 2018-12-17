
public class Aufgabe1bQuadratVoll {

	public static void main(String[] args) {
		
	StdOut.println("Geben Sie die Anzahl der Sternchen an: ");
	int n = StdIn.readInt();
	
	for(int j=0; j<n; j++){
		for(int i=0; i<n; i++){
			StdOut.print("*");
		}
		StdOut.println("");
		}
	}
}