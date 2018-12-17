
public class SchleifenQuadrat2 {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie die Anzahl der Sternchen an: ");
		int n = StdIn.readInt();
		
		for(int i=0; i<n; i++){
			if(i==0 || i == (n-1)){
				
				for(int j=1; j<=n; j++){
				StdOut.print("*");
				}
				StdOut.println("");
			}
			else{
				
				StdOut.print("*");
					for(int j=2; j<n; j++){
					StdOut.print(" ");
					}
			StdOut.println("*");
			}
		}		
	}
}	
