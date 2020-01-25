package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	
	for (int i = 0; i <= 100; i++) {
		System.out.println(i);
	}
	for (int j = 100; j >= 0; j--) {
		System.out.println(j);
	}
	for (int o = 2; o <= 100; o++) {
		if (o%2==0) {
			System.out.println(o);
		}
	}
	for (int l = 1; l <= 99; l++) {
		if (l%2==1) {
			System.out.println(l);
		}
	}
	for (int k = 0; k <= 500; k++) {
		if (k%2==0) {
			System.out.println(k+" Even");
		}
		if (k%2==1) {
			System.out.println(k+" Odd");
		}
		for (int m = 0; m <= 777; m++) {
			if(m%7==0) {
				System.out.println(m);
			}
		}
		int y=-1;
		for (int p = 2005; p <= 2020; p++) {
			y=y+1;
			System.out.println("In "+p+" I was "+y+" years old.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
