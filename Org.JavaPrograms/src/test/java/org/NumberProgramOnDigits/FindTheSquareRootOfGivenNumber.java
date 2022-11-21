package org.NumberProgramOnDigits;

public class FindTheSquareRootOfGivenNumber {
	public static void main(String[] args) {
		int num=94;
		int i=2;
		int count=0;
		while (i<=num) {
			if (i*i==num) {
				count++;
				break;
			}i++;
		}
		if (count==1) {
			System.out.print("Square Root of Given Number is :- "+i);
		}else {
			System.out.print("Given Number is :- "+i+" is not a Perfect Square");
		}
	}
}
