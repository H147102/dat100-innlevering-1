package innleveringer;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.System.*;

public class O3 {
	public static void main (String[] args) {
		String nInput = showInputDialog("skriv in et positivt tall");
		int n = Integer.parseInt(nInput);
		int sumN = 1;
		while (n>0) {
			sumN = sumN * n;
            n--;
		}
		out.println(sumN);
	}
}
