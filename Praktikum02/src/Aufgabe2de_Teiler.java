
public class Aufgabe2de_Teiler {

	public static void main(String[] args) {
	
		while(true) {														//endlos-schleife, man kann immer einen neuen Teiler eingeben
			
			StdOut.println("Geben Sie eine Zahl ein: ");
			int z = StdIn.readInt();
			
			for(int i=1; i<z; i++) {										//geht jede mögliche zahl bis zu sich selber durch
				if(z%i == 0) {											    // wenn mod = 0, dann ist die zahl teilbar und wird ausgegeben
					StdOut.println(i + " ist ein Teiler von " +z);
				}
			}
		}
	}
}
