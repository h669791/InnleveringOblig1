package no.hvl.dat100;
 import static javax.swing.JOptionPane.*;
//import java.util.Scanner;
import static java.lang.Integer.*;
public class OppgaveO2 {

	public static void main(String[] args) {
		
		
		//Scanner scan = new Scanner(System.in)

		
		for (int i = 0; i <= 9; i++) {
			//System.out.println("Skriv inn poeng: ");
			String printTxt = (showInputDialog("Skriv inn poeng: "));
			int poeng = parseInt(printTxt);
		
	
		if(poeng < 100 && poeng >= 90){
			//System.out.println("Fremragende, karakter A");
			showMessageDialog (null,"Karakter A");
		}else if(poeng < 89 && poeng >= 80){
			//System.out.println("Meget godt, karakter B");
			showMessageDialog(null, "Meget godt, karakter B");
		}else if(poeng < 79 && poeng >= 60){
			//System.out.println("God, karakter C");
			showMessageDialog(null, "God, karakter C");
		}else if(poeng < 59 && poeng>= 50){
			//System.out.println("Nokså god, karakter D");
			showMessageDialog(null, "Nokså god, karakter D");
		}else if(poeng < 49 && poeng >= 40){
			//System.out.println("Tilstrekkelig, karakter E");
			showMessageDialog(null, " Tilstrekkelig, karakter E");
		}else if(poeng < 39 && poeng >= 0){
			//System.out.println("Ikke bestått, karakter F");
			showMessageDialog(null, "Ikke bestått, karakter F");
		}else if(poeng > 100 || poeng < 0) {
			//System.out.println("Ugydlig karakter")
			showMessageDialog(null, "Ugyldig karakter");
		i--;
		
		
			}
		}
		
	}

}
	