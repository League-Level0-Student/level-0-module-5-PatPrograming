package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	
String num=JOptionPane.showInputDialog("Please enter a number.");
int num1=Integer.parseInt(num);

boolean check=false;
for (int i = 2; i < num1; i++) {
	if (num1%i==0) {
		check=true;
	}
	
}
if (check=true) {
	JOptionPane.showMessageDialog(null, "The number is not prime.");
}
else {
	JOptionPane.showMessageDialog(null, "The number is prime.");
}


}
}
