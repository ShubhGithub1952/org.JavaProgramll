package org.StringsPrograms;

import java.util.Scanner;

public class PrintTheReverseTheStringTest {
	public static void main(String[] args) {
		for ( ; ; ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre the String........");
			String str = sc.nextLine();
			String[] str1 = str.split(" ");
			for (int i =str1.length-1 ; i >=0; i--) {
				System.out.print(str1[i]+" ");
			}
			System.out.println();
		}
		
	}
}
