package org.StringsPrograms;

import java.util.Scanner;

public class PrintTheStringLastNameFirstandFirstNameLastTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String .......");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		String str2 = str1[0];
		str1[0]=str1[str1.length-1];
		str1[str1.length-1]=str2;
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]+" ");
		}
	}
}
