package org.digitPrograms1;

public class FindThePrimeNumberTest1 {
	public static void main(String [] args) {
		int numb=21;
		int count=0;
		int n=2;
		while (numb/2>n) {
			if (numb%n==0) {
				count++;
				break;
			}
			n++;
		}
		if (count==1) {
			System.out.println("Given Number isnot a Prime number !");
		} else {
			System.out.println("Given Number a Prime number !");
		}
	}
}
