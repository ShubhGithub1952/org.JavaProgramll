package org.NumberPrograms;

public class SwapNumberUsingThirdVeriable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("Value of a is - "+a);
		System.out.println("Value of b is - "+b);
	}
}
