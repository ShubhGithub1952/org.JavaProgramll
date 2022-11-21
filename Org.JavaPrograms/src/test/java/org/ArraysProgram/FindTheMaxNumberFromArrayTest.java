package org.ArraysProgram;

public class FindTheMaxNumberFromArrayTest {
	public static void main(String[] args) {
		int [] a= {20,40,50,10,30};
		int max=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]<a[i+1]) {
				max=a[i];
			}
		}
		//System.out.println(max);
		for (int i = 0; i < a.length-1; i++) {
			if (max==a[i]) {
				System.out.println(a[i]+" :- is Maximum Number From Array !");
			}
		}
	}
}
