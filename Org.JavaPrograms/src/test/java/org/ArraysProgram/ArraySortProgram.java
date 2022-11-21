package org.ArraysProgram;

import java.util.Scanner;

public class ArraySortProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the size of Array ....");
		  int size = sc.nextInt();
		 int [] arr= new int[size];
		System.out.println("Entre the Element inside array...");
		for (int i = 0; i < size ; i++) {
			arr[i]=sc.nextInt();
		}
		
		ArraySortProgram.reverse(arr, size);
	}
	
	static void reverse(int [] arr,int size) {
		for (int i = size-1 ; i >= 0; i--) {
			System.out.println(arr[i]+",");
		}
	}
}
