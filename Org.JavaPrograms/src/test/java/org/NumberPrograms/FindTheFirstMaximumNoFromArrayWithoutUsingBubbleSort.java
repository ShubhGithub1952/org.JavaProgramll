package org.NumberPrograms;

public class FindTheFirstMaximumNoFromArrayWithoutUsingBubbleSort {

	public static void main(String[] args) {
		int [] a= {40,20,30,10,50};
		int fMax=a[0];
		for (int i = 0; i < a.length; i++) {
			if (fMax<a[i]) {
				fMax=a[i];
			}
		}
		System.out.println("First Maximum Number is :- "+fMax);
	}

}
