public class Aufgabe2c_IntBereich2 {
	public static void main(String[] args) {
		
		StdOut.println("Geben Sie eine Integer Zahl ein: ");
		double i = StdIn.readDouble();
		
		if(i<1){
			StdOut.println("Fehler: Die Zahl ist kleiner als 1!");
		}
		else if(i>2147483647){
			StdOut.println("Fehler: Die Zahl ist zu gross!");
		}
		else{
			StdOut.println("Die Zahl: " + i + " passt in die Integer-Arithmetik");
		}
	}
}
