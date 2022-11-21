package org.NumberPrograms;

public class FindTheFirstMinimumNoFromArrayWithoutUsingBubbleSort {
	public static void main(String[] args) {
		int [] a= {50,30,20,40,10};
		int fmin=a[0];
		for (int i = 0; i < a.length; i++) {
			if (fmin>a[i]) {
				fmin=a[i];
			}
		}
		
		System.out.println("The First Minimum Number is :- "+fmin);
		//System.out.println("The Second Minimum Number is :- "+);
	}
}
