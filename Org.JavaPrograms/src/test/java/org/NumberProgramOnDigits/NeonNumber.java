package org.NumberProgramOnDigits;

public class NeonNumber {
	public static void main(String[] args) {
		int num=81;
		int sq=num*num;
		int count=0;
		int sum=0;
		while (sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (sum==num) {
			System.out.println("Given Number is Neon Number !");
		}else {
			System.out.println("Given Number isnot Neon Number !");
		}
	}
}
