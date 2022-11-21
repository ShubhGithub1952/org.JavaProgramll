package org.StringsPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountUniqueCharacterPresentInTheStringTest {
	public static void main(String[] args) {
		//String str="MALAYALAMISLANGUAGE";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String......");
		String str = sc.nextLine();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for (Character ch : set) {
			//System.out.println(ch);
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if (ch==str.charAt(i)) {
					count++;
				}
			}
			if (count==1) {
				System.out.println("In Given String These Character's are Unique "+ch);
			}
		}
	}
}
