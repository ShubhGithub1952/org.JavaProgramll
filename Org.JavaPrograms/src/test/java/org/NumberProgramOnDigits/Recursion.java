package org.NumberProgramOnDigits;

public class Recursion {
	static int a;
	public static void call(int a) {
		if (a<100) {
			System.out.println(a);
			a++;
			call(a);
		}
	}
	
	public static void main(String[] args) {
		Recursion.call(1);
	}
}
