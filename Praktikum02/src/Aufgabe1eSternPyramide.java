
public class Aufgabe1eSternPyramide {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie die Zeilenanzahl ein: ");
		int z = StdIn.readInt();
		
		for(int i=0; i<z; i++){                         //for-schleife anzahl zeilen
			
			for(int j= z-1; j>i; j--){					//j zähler für leerzeichen, dekrement da weniger leerzeichen pro weitere zeile
				StdOut.print(" ");
			}
				
				for(int k=0; k<=i*2; k++){				//k zähler für sterne
					StdOut.print("*");
				}
			StdOut.println("");
		}
	}
}
