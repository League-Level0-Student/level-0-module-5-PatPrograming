package _02_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
	int var1=0;
	int var2=1;
	int var3 = 1;
	System.out.println(var1);
	System.out.println(var2);
	for (int i = 0; i < 12; i++) {
		var3=var1+var2;
		System.out.println(var3);
		var1=var2;
		var2=var3;
		
	}
}
}
