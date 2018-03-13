import javax.swing.JOptionPane;

public class PrimeIsItNot {

	public static void main(String[] args) {
		
		String isIt = JOptionPane.showInputDialog("Tell me a number!!!!!");
		
		int prime = Integer.parseInt(isIt);
		
		for (int i = 2; i < prime; i++) {
			
		if (prime % i == 0) {
			
			JOptionPane.showMessageDialog(null, "Your number is NOT prime");
			System.exit(0);
		}
			
			
			
		}
		
		
		JOptionPane.showMessageDialog(null, "Your number is prime");
		
		
		
		
	}
	
	
}
