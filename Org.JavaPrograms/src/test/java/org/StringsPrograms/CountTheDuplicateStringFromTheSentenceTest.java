package org.StringsPrograms;

import java.util.LinkedHashSet;

public class CountTheDuplicateStringFromTheSentenceTest {
	public static void main(String[] args) {
		String str="WELCOME TO TO BANGALORE";
		String[] str1 = str.split(" ");
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		for (int i = 0; i < str1.length; i++) {
			set.add(str1[i]);
		}
		
		for (Object obj : set) {
			int count=0;
			for (int i = 0; i < str1.length; i++) {
				if (obj.equals(str1[i])) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(obj+" String From the Array Of String has repeated :- "+count);
			}
		}
	}
}
