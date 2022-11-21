package org.StringsPrograms;

import java.util.LinkedHashSet;

public class CountTheCharacterHowManyTimeRepeatedTest {
	public static void main(String[] args) {
		String str="MALAYALAM";
		String str1 = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if (ch==str.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+" Character has Reapeated :- "+count+" times");
		}
	}
}
