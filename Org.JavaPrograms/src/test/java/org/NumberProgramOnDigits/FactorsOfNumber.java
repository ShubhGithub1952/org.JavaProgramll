package org.NumberProgramOnDigits;

public class FactorsOfNumber {
	public static void main(String[] args) {
		int num=6;
		int n=2;
		while (num>=n) {
			if (num%n==0) {
				System.out.println("Factors of  "+num+" are :- "+n);
			}
			n++;
		}
	}
}
