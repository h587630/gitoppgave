package no.hvl.data100;
import static javax.swing.JOptionPane.*;

public class bruttoInntekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En trinnskatt (tidligere toppskatt) er en progressiv skatt p� brutto l�nn 
		//som beregnes n�r inntekten er h�yere enn 164 100kr.
		// kan mann bruke do og whole setning,hvis m� mann gj�re det flere ganger?
		
		int l�nn=Integer.parseInt(showInputDialog("brutto l�nn:"));
		int Skatt=0;
		if (l�nn<=164100) {
			showMessageDialog(null, Skatt+ " 0.00 prosent");
		}else if(l�nn<=230950) {
			showMessageDialog(null, Skatt +" 0,93 prosent");
		}else if(l�nn<=580650) {
			showMessageDialog(null, Skatt+" 2,41 prosent");
		}else if(l�nn<=934050) {
			showMessageDialog(null, Skatt+" 11,52 prosent");
		}else if(l�nn>=934051) {
			showMessageDialog(null, Skatt+" 14,52 prosent");
		
	}

}
}
