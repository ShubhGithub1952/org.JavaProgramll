package org.digitPrograms1;

public class FindTheSquareRootOfGivenNumberTest1 {
	public static void main(String[] args) {
		int numb=225;
		int squareRoot=0;
		int temp=2;
		while (numb/2>0) {
			if (temp*temp==numb) {
				squareRoot=squareRoot+temp;
				break;
			} 
			temp++;
		}
		System.out.println("SquareRoot of "+numb+" is :- "+squareRoot);
	}
}
