package org.NumberProgramOnDigits;

public class FindThePrimeNumber {
	public static void main(String[] args) {
		int num=15;
		int n=2;
		int count=0;
		while (n<=num/2) {
			if (num%n==0) {
				count++;
				break;
			}
			n++;
		}
		if (count==1) {
			System.out.println("Given Number :- "+num+" is not Prime Number !");
		}else {
			System.out.println("Given Number :- "+num+" is  Prime Number !");
		}
	}
}
