package org.NumberPrograms;

public class BubbleSortingInAscendingOrderWithUsingThirdVeriablTest {
	public static void main(String[] args) {
		int [] a={70,40,50,20,10,30};
		System.out.println("  Before Sorting :- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1 ; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("   After Sorting :- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}
}
