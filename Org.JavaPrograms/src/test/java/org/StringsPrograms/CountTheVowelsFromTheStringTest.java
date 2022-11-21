package org.StringsPrograms;

import java.util.Scanner;

public class CountTheVowelsFromTheStringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String ....");
		String str = sc.nextLine();
		int count=0;
		char [] ch= new char[str.length()];
		for (int j = 0; j < ch.length; j++) {
			ch[j]=str.charAt(j);
			if (ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u') {
				count++;
			}
		}
		System.out.println("Given String contains :- "+count+" Vowels !");
	}
}
