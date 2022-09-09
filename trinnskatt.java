import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class trinnskatt{
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Brutto: " );
		int b = parseInt(tallTxt);
		if (b >= 2000000)
			System.out.println("Du må betale 17.4% trinnskatt på " + b*0.174 +"kr" + "| Netto: " + b*0.826 + "kr");
		else if (969200<=b && b<=1999999)
			System.out.println("Du må betale 16,4% trinnskatt på " + b*0.164 +"kr" + "| Netto: " + b*0.836 + "kr");
		else if (643800<=b && b<=969199)
			System.out.println("Du må betale 13,4% trinnskatt på " + b*0.134 +"kr" + "| Netto: " + b*0.866 + "kr");
		else if (267900<=b && b<=643799)
			System.out.println("Du må betale 4,0% trinnskatt på " + b*0.04 +"kr" + "| Netto: " + b*0.96 + "kr");
		else if (190350<=b && b<=267899)
			System.out.println("Du må betale 1,7% trinnskatt på " + b*0.017 +"kr" + "| Netto: " + b*0.983 + "kr");
		else //b<190350
			System.out.println("Du må ikke betale trinnskatt");
	}
}
