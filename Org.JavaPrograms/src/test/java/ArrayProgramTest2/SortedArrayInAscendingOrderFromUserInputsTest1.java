package ArrayProgramTest2;

import java.util.Scanner;

public class SortedArrayInAscendingOrderFromUserInputsTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Specify the Size of Array..");
		int size = scanner.nextInt();
		int [] array= new int[size];
		System.out.println("Kindly Entre the Elements of Array...");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0+i; j < array.length; j++) {
				if (array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				} 
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}
}
