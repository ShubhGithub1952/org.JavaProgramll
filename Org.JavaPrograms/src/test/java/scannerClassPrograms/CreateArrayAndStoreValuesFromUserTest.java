package scannerClassPrograms;

import java.util.Scanner;

public class CreateArrayAndStoreValuesFromUserTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the Size of Array......");
		int size= sc.nextInt();
		int [] numb= new int[size];
		System.out.println("Entre the Values wants to store inside Array..");
		for (int i = 0; i < numb.length; i++) {
			numb[i]=sc.nextInt();
		}
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);
		}
	}
}
