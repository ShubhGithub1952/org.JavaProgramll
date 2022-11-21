package org.NumberPrograms;

public class AdditionOfTwoArraysTest {
	public static void main(String[] args) {
		int [] a= {5,8,3,4};
		int [] b= {4,3,6,5,2};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;
		}
		for (int i = 0; i <length; i++) {
			
			try {
				System.out.print(a[i]+b[i]+", ");
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
	}
}
