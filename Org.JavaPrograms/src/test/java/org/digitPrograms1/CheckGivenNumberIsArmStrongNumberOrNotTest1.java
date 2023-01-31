package org.digitPrograms1;

public class CheckGivenNumberIsArmStrongNumberOrNotTest1 {
	public static void main(String[] args) {
		int numb=153;
		int temp1=numb;
		int temp2=temp1;
		int count=0;
		int sum=0;
		
		while (numb>0) {
			numb=numb/10;
			count++;
		}
		//System.out.println(count);
		while (temp1>0) {
			int rem=temp1%10;
			int power=count;
			int mul=1;
			while (power>0) {
				mul=mul*rem;
				power--;
			}
			sum=sum+mul;
			temp1=temp1/10;
		}
		if (temp2==sum) {
			System.out.println("Given "+temp2+" is a Armstrong Number !");
		} else {
			System.out.println("Given "+temp2+" isnot a Armstrong Number !");
		}
	}
}
