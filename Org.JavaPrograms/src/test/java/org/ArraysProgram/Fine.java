package org.ArraysProgram;

public class Fine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5};
		int n=a[0];
		//int[] b= new int[a.length];
		while (n<3) {
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i+1; j < a.length; j++) {
					if(true) {
					a[i]=a[i+1];
					}
					else if (a.length==a.length) {
						
						a[a.length-1]=n;
					}
				}
				System.out.print(a[i]+"   ");

			}
			n++;
		}

	}

}
