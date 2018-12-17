
public class Aufgabe1eSternPyramide {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie die Zeilenanzahl ein: ");
		int z = StdIn.readInt();
		
		for(int i=0; i<z; i++){
			
			for(int j= z-1; j>i; j--){
				StdOut.print(" ");
			}
				
				for(int k=0; k<=i*2; k++){
					StdOut.print("*");
				}
			StdOut.println("");
		}
	}
}
