package org.ArraysProgram;

public class SwapandSortingArrayDependsUponElementTest {
	public static void main(String[] args) {
		int [] a= {1,0,0,1,0};
		int m=0;
		int n=a.length-1;
		int [] b= new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				b[m]=a[i];
				m++;
			}else {
				b[n]=a[i];
				n--;
			}
		}
		
		System.out.println("After Sorting");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+", ");
		}
	}
}
