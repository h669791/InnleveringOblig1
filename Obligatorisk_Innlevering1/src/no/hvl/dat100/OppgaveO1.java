package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
//import static java.lang.Math.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
	
	String printTxt = (showInputDialog("Skriv inn lønn"));
	double lonn = parseInt(printTxt);
	//double trinn0 = lonn * 0.00;
	double trinn1 = lonn * 0.0093;
	double trinn2 = lonn * 0.0241;
	double trinn3 = lonn * 0.1152;
	double trinn4 = lonn * 0.1452;
	
	
	if(lonn <= 164100 && lonn >= 0) {
		showMessageDialog(null, "Lønn = " + lonn + "\n" + "Skatt = " + "0.00%" + "\n" + "Trinnskatt 0: ");	
	}else if(lonn <= 230950 && lonn >= 164101 ) {
		showMessageDialog(null, "Lønn = " + lonn + "\n" + "Skatt = " + trinn1 + "\n" + "Trinnskatt 1: ");
	}else if(lonn <= 580650 && lonn >= 230951) {
		showMessageDialog(null, "Lønn = " + lonn + "\n" + "Skatt = " + trinn2 + "\n" + "Trinnskatt 2: ");
	}else if(lonn <= 934050 && lonn >= 580651) {
		showMessageDialog(null, "Lønn = " + lonn + "\n" + "Skatt = " + trinn3 + "\n" + "Trinnskatt 3: ");
	}else if(lonn >= 934051 ) {
		showMessageDialog(null, "Lønn = " + lonn + "\n" + "Skatt = " + trinn4 + "\n" + "Trinnskatt 4: ");
	}
	

	}

}