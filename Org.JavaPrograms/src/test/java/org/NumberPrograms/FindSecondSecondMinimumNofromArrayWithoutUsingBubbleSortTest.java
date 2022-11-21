package org.NumberPrograms;

public class FindSecondSecondMinimumNofromArrayWithoutUsingBubbleSortTest {
	public static void main(String[] args) {
		int [] a= {50,30,10,40,20};
		int fmin=a[0];
		int smin=a[0];		
		for (int i = 0; i < a.length; i++) {
			if (fmin>a[i]) {
				smin=fmin;
				fmin=a[i];
			}else if (smin>a[i]) {
				smin=a[i];
			}
		}
		System.out.println("First Minimum Number From Array is :- "+fmin);
		System.out.println("First Minimum Number From Array is :- "+smin);
		}
}
