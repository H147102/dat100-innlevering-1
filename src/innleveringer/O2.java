package innleveringer;
import static java.lang.System.*;
import static javax.swing.JOptionPane.showInputDialog;
public class O2 {
	public static void main(String[] args) {
		for (int e = 1; e <= 10;) {
			String karakterInn = showInputDialog ("skriv Karakter til elev "+e+", kun tall mellom 0-100 blir godkjent.");
			if (karakterInn.matches("-?[90-9]+")){
				int karakter = Integer.parseInt(karakterInn);
				if (karakter >= 0 && karakter <=100 ) {
					e++;
					if (karakter >=0 && karakter <= 39 ){
						out.println("Det ble stryk karakter");
						}
					else if (karakter >=40 && karakter <= 49 ){
						out.println("det ble en E karakter");				
						}
					else if (karakter >=50 && karakter <= 59 ){
						out.println("det ble en D karakter");
						}
					else if (karakter >=60 && karakter <= 79 ){
						out.println("det ble en C karakter");
						}
					else if (karakter >=80 && karakter <= 89 ){
						out.println("det ble en B karakter");
						}
					else if (karakter >=90 && karakter <= 100 ){
						out.println("det ble en A karakter!");
						}
					}
				else { out.println("du ga ugyldig verdi");	}
				}
			else out.println("du skrev inn en ugyldig symboler");
			}
		}
}