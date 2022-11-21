package org.NumberPrograms;

public class PrintTheArrayInDescendingOrderTest {
	public static void main(String[] args) {
		int [] a= {50,30,40,10,20};
		System.out.println("Before Sorting Array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("After Sorting Array ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		
	}
}
