package org.digitPrograms1;

public class FindTheStrongNumberTest1 {
	public static void main(String[] args) {
		int numb=154;
		int sum=0;
		int temp=numb;
		while (numb>0) {
			int fact=1;
			int rem=numb%10;
			while (rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			numb=numb/10;
		}
		if (sum==temp) {
			System.out.println("Given "+temp+" is a Strong number !");
		} else {
			System.out.println("Given "+temp+" is not a Strong number !");
		}
	}
}
