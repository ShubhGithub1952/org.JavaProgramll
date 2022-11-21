package org.NumberPrograms;

public class PrintSmallestNumberFromArrayTest {

	public static void main(String[] args) {
		int [] a= {60,40,20,10,50,30};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("1st Smallest Number From Array is :- "+a[0]);
		System.out.println("2nd Smallest Number From Array is :- "+a[1]);
		System.out.println("Largest Maximum Number From Array Is :- "+ a[a.length-1]);
		System.out.println("Largest Maximum Number From Array Is :- "+ a[a.length-2]);
	}

}
