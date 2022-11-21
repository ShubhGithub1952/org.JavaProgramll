package org.NumberProgramOnDigits;

public class SunnyNumber {
	public static void main(String[] args) {
		int n=30;
		int i=2;
		int count=0;
		int num=n+1;
		while (num>0) {
			if (num==i*i) {
				count++;
				break;
			}
			i++;
		}
		if (count==1) {
			System.out.println("Sunny Number !");
		}else {
			System.out.println("Not Sunny Number !");
		}
	}
}
