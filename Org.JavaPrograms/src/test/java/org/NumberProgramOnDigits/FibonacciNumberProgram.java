package org.NumberProgramOnDigits;

public class FibonacciNumberProgram {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=a+b;
		while (c<=35) {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
