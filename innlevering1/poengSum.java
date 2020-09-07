package no.hvl.data100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Integer.*;
public class poengSum {

	public static void main(String[] args) {
//Lag et program som leser inn en poengsum (heltall) som en student har oppnådd 
//på en prøve,og finn og skriv ut den karakteren A-F dette tilsvarer.
	  for(int i=0; i<10; i++) {	  
			
			int tall=Integer.parseInt(showInputDialog("poeng:"));
			
			if (tall>100) {
				showMessageDialog(null, tall+ "Karakteren er Ugyldig");
			}else if(tall>= 90) {
				showMessageDialog(null, tall+" Karakteren er A");
			}else if(tall>=80) {
				showMessageDialog(null, tall+" Karakteren er B");
			}else if(tall>=60) {
				showMessageDialog(null, tall+" Karakteren er C");
			}else if(tall>=50) {
				showMessageDialog(null, tall+" Karakteren er D");
			}else if(tall>=40) {
				showMessageDialog(null, tall+" Karakteren er E");
			}else if(tall>=0) {
				showMessageDialog(null, tall+" Karakteren F");
		    }else if(tall<0) {
				showMessageDialog(null, tall+" Ugyldig");
		    }}
	  
	  
	
	}
}

	
		
	
	
		
	
	
	
	
	
	   
	    
	 
