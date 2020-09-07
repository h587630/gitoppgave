package no.hvl.data100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class heltallNFakultett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lag et program som leser inn et heltall n > 0, beregner verdien n! 
		//(n fakultet) og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
		
		String melding= showInputDialog("Skriv et heltall:");
		
		int n= parseInt(melding);
		int sum=1;
		
		for(int i = 1; i<=n; i++) {
			sum = sum *i;
		}
		showMessageDialog(null,sum);
		
				
	}

}
