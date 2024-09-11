package innleveringer;
import static java.lang.Integer.parseInt;
import static java.lang.System.*;
import static javax.swing.JOptionPane.showInputDialog;
public class O1 {
	public static void main(String[] args) {
		String bruttoInntekt = showInputDialog ("skriv in bruttoinntekt og du vil få vite hva trinnskatten din er");
		if (bruttoInntekt.matches("-?[0-9]+")){
		double brutto = parseInt(bruttoInntekt);
			if (brutto >=0 && brutto <= 208050) {
				out.println("Du har ingen trinnskatt");
			}
			else if (brutto > 208050 && brutto <= 292850) {
				out.println("du har trinnskatt 1 som er 1.7%, da blir trinnskatten din "+(brutto*0.017));
			}
			else if (brutto > 292850 && brutto <= 670000) {
				out.println("du har trinnskatt 2 som er 4%, da blir trinnskatten din "+(brutto*0.04));
			}
			else if (brutto > 670000 && brutto <= 937900) {
				out.println("du har trinnskatt 3 som er 13.6%, da blir trinnskatten din "+(brutto*0.136));
			}
			else if (brutto > 937900 && brutto <= 1350000) {
				out.println("du har trinnskatt 4 som er 16.6%, da blir trinnskatten din "+(brutto*0.166));
			}
			else if (brutto >1350000) {
				out.println("du har trinnskatt 5 som er på 17.6%, da blir trinnskatten din "+(brutto*0.176));
			}
			else out.println("Du ga ugyldig verdi");
		}
		else out.println("du skrev ikke inn tall");
	}

}
