import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
//karakterskala for ti elever

public class karakter {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) { //if setningene er inni for-løkken for å kunne gjenta 10 ganger
			String karakter = showInputDialog("Poeng: ");
			int p = parseInt(karakter);
			if (p>=90 && p<=100) 
				System.out.println("Karakter A");
			else if (p>=80 && p<=89)
				System.out.println("Karakter B");
			else if (p>=60 && p<=79)
				System.out.println("Karakter c");
			else if (p>=50 && p<=59)
				System.out.println("Karakter D");
			else if (p>=40 && p<=49)
				System.out.println("Karakter E");
			else if (p>=0 && p<=39)
				System.out.println("Karakter F");
			else { //p<0 og p>100
				System.out.println("ugyldig poengsum");
				i = i - 1;//kontrollerer ugyldige summer
			}
		}
	}
}

			
			
