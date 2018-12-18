
public class Aufgabe2bc_IntBereich {

	public static void main(String[] args) {
		
		StdOut.println("Geben Sie eine Integer-Zahl ein: ");
		double i = StdIn.readInt();
		
		while(i<1 || i>2147483647) {												//solange die zahl ausserhalb der int- arithmetik ist, neue eingabe
			StdOut.println("Die Zahl passt nicht in die Int-Arithmetik");
			StdOut.println("Geben Sie eine neue Zahl ein: ");
			i = StdIn.readInt();
		}		
		StdOut.println("Die Zahl: " + (int)i + " passt in die Int-Artithmetik!");
	}
}