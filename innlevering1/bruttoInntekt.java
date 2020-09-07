package no.hvl.data100;
import static javax.swing.JOptionPane.*;

public class bruttoInntekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn 
		//som beregnes når inntekten er høyere enn 164 100kr.
		// kan mann bruke do og whole setning,hvis må mann gjøre det flere ganger?
		
		int lønn=Integer.parseInt(showInputDialog("brutto lønn:"));
		int Skatt=0;
		if (lønn<=164100) {
			showMessageDialog(null, Skatt+ " 0.00 prosent");
		}else if(lønn<=230950) {
			showMessageDialog(null, Skatt +" 0,93 prosent");
		}else if(lønn<=580650) {
			showMessageDialog(null, Skatt+" 2,41 prosent");
		}else if(lønn<=934050) {
			showMessageDialog(null, Skatt+" 11,52 prosent");
		}else if(lønn>=934051) {
			showMessageDialog(null, Skatt+" 14,52 prosent");
		
	}

}
}
