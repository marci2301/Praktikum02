public class Wertebereich2 {
	public static void main(String[] args) {
		
		StdOut.println("Geben Sie eine Integer Zahl ein: ");
		double i = StdIn.readDouble();
		
		while(i<1 || i>2147483647){
		
			if(i<1){
				StdOut.println("Fehler: Die Zahl ist kleiner als 1!");
				StdOut.println("Geben Sie eine neue Integer Zahl ein: ");
				i = StdIn.readDouble();
			}
			else{
				StdOut.println("Fehler: Die Zahl ist zu gross!");
				StdOut.println("Geben Sie eine neue Integer Zahl ein: ");
				i = StdIn.readDouble();
			}
		}
		StdOut.println("Die Zahl: " + (int)i + " passt in die Integer-Arithmetik");
	}
}
