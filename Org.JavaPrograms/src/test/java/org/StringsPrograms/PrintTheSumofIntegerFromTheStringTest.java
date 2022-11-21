package org.StringsPrograms;

public class PrintTheSumofIntegerFromTheStringTest {
	public static void main(String[] args) {
		String str="a1b2c3";
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9' ) {
				sum=sum+(str.charAt(i)-48);
			}
		}
		System.out.println("Sum Of The Digit Present in String is :- "+sum);
	}
}
