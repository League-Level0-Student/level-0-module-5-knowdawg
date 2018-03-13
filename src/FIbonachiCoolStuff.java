import javax.swing.JOptionPane;

public class FIbonachiCoolStuff {
public static void main(String[] args) {
	
int num1 = 0;
int num2 = 1;
int num3 = num1+num2;
int turn = 1;
	JOptionPane.showMessageDialog(null, num1);
	JOptionPane.showMessageDialog(null, num2);
	for (int i = 0; i < 11; i++) {
		num3 = num1+num2;
		
		JOptionPane.showMessageDialog(null, num3);
		
		
		if (turn == 1) {
			
			num1 = num3;
			turn += 1;
			
		} else{
			
			num2 = num3;
			turn -= 1;
			
		}

		
		
		
		
	}
	
	
	
	
}
	
	
	
}
