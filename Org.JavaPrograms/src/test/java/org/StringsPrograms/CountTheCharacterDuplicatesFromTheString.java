package org.StringsPrograms;

import java.util.LinkedHashSet;

public class CountTheCharacterDuplicatesFromTheString {
	public static void main(String[] args) {
		String str="MALAYALAM";
		
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
			if (count>1) {
				System.out.println(ch+" has Repeated :- "+count+" times");
			}
		}
	}
}
