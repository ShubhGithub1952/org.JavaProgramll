package org.NumberPrograms;

public class PrintLargestNumberFromArrayTest {
	public static void main(String[] args) {
		int [] a= {40,30,20,10,50};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("First Largest Number From Array is :- "+a[0]);
		System.out.println("Second Largest Number From Array is :- "+a[1]);
		System.out.println("Smallest Number From Array is :- "+a[a.length-1]);
		System.out.println("Smallest Number From Array is :- "+a[a.length-2]);
	}
}
