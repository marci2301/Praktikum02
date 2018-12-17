
public class Teiler {

	public static void main(String[] args) {
		
		StdOut.println("Eingabe einer Zahl zum Teiler suchen: ");
		int t = StdIn.readInt();
		
		for(int i=0; i<=t; i++){
			
			if(t%i == 0){
				StdOut.println("Teiler: " + i);
			}
		}
	}
}
