package org.ArraysProgram;

public class ArrayLoop {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n=0;
		while (n<3) {
			int temp= a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i]=a[i+1];
				if (i==a.length-2) {
					a[a.length-1]=temp;
				}
			}
			
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("]");
		n++;
		}	
}

}
