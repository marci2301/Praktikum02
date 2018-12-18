public class Aufgabe1dQuadratLeer {
	
	public static void main(String[] args) {
		
		StdOut.println("Anzahl der Zeilen eingeben: ");
		int z = StdIn.readInt();
		
		for(int i=0; i<z; i++){             // erste sternreihe
			StdOut.print("*");
		}
		StdOut.println("");		
		
		for(int i=0; i<(z-2); i++){         // for-schleife anzahl zeilen, -2 da obere und untere sternreihe
			StdOut.print("*");
			for(int j=0; j<(z-2); j++){     // for-schleife zeichen in einer zeile, -2 da erste und letzte zeichen stern
				StdOut.print(" ");			
			}
			StdOut.println("*");		
		}
		
		for(int i=0; i<z; i++){				//// letzte sternreihe
			StdOut.print("*");
		}
	}
}
