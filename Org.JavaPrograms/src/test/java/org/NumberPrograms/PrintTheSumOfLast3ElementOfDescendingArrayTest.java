package org.NumberPrograms;

public class PrintTheSumOfLast3ElementOfDescendingArrayTest {
	public static void main(String[] args) {
		int [] a= {50,30,10,40,20,60};
		
		System.out.println("Before Sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1 ; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
		int sum=0;
		for (int i = a.length-1 ; i >=3 ; i--) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Last 3 Elements of Array is :- "+sum);
	}
}
