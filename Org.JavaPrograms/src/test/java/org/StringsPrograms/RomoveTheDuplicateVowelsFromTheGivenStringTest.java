package org.StringsPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RomoveTheDuplicateVowelsFromTheGivenStringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String .....");
		String str = sc.nextLine();
		//char[] ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		int count=0;
		for (Character ch : set) {
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(str+" Contains Vowels without duplicate :- "+count);
	}
}
