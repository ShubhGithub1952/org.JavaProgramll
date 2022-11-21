package org.NumberPrograms;

public class AdditionOfTwoArraysTest2 {
	public static void main(String[] args) {
		int [] a= {2,4,5,3,1};
		int [] b= {1,3,2,4};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;
		}
		for (int i = 0; i < a.length; i++) {
			try {
				System.out.print(a[i]+b[i]+", ");
			} catch (Exception e) {
				// TODO: handle exception
				if (a.length<b.length) {
					System.out.print(b[i]);
				}
				else {
					System.out.print(a[i]);
				}
			}
		}
	}
}
