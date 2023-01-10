package scannerClassPrograms;

import java.util.Scanner;

public class TakeInputFromUserStoreInsideArrayAndSortTheArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the Size of Array...");
		int size= sc.nextInt();
		int [] numb= new int[size];
		System.out.println("Entre the Element to store inside Array...");
		for (int i = 0; i < size; i++) {
			numb[i]=sc.nextInt();
		}
		// Sort the Array Using Bubble Sort in Ascending Order
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (numb[i]>numb[j]) {
					int temp=numb[i];
					numb[i]=numb[j];
					numb[j]=temp;
				}
			}
		}
		
		//Print Array After Sorting
		System.out.println("Print Array After Sorting");
		for (int i = 0; i < size; i++) {
			System.out.println(numb[i]);
		}
	}
}
