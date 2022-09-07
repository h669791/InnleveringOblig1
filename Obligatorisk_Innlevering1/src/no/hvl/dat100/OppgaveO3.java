package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
//import static java.lang.Math.*;
import static java.lang.Integer.*;



public class OppgaveO3 {

	public static void main(String[] args) {
		
		
		String printTxt = (showInputDialog("Skriv inn et positivt tall"));
		int fakultet = parseInt(printTxt);
		
		while(fakultet < 0 ) {
			showMessageDialog(null, "Ugyldig tall, prøv igjen på nytt!");
			printTxt =(showInputDialog("Skriv inn et positivt tall"));
			fakultet = parseInt(printTxt);
			
			
			
		}
		int resultat = 1;
		for (int i= 1; i <=fakultet; i++)
		{
		
			resultat = resultat * i;
		
		}
		
		
		
		showMessageDialog(null, "fakultet av " + fakultet + " er " + resultat);
	
				
			/*Lag et program som leser inn et heltall n > 0, 
				 * beregner verdien n! (n fakultet) og skriver 
				 * verdien til n! ut på skjermen, der
				 *  n! = 1*2*3* … *(n-1)*n.
				 */
		
		
		
		

	}

}