package org.PatternPrograms5;

public class DiamondPatternTest1 {

	public static void main(String[] args) {
		int numb=5;
		for (int i = 0; i < numb ; i++) {
			for (int j = 0; j < numb ; j++) {
				if (i+j>=numb-1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < numb ; i++) {
			for (int j = 0; j < numb-1 ; j++) {
				if (i<=j) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
