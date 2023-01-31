package org.digitPrograms1;

public class FindThePrimeNumberFromTheGivenArrayTest {
	public static void main(String[] args) {
		int [] numb= {10,13,17,15,21,28,64,11};
		for (int i = 0; i < numb.length; i++) {
			int temp=numb[i];
			int count=0;
			int test=2;
			while (temp/2>test) {
				if (temp%test==0) {
					count++;
					break;
				}
				test++;
			}
			if (count==1) {
				System.out.println("Given "+numb[i]+" is not a Prime Number !");
			} else {
				System.out.println("Given "+numb[i]+" is a Prime Number !");
			}
		}
	}
}
