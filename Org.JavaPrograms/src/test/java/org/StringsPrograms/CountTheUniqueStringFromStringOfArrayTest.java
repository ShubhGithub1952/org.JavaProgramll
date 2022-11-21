package org.StringsPrograms;

import java.util.LinkedHashSet;

public class CountTheUniqueStringFromStringOfArrayTest {
	public static void main(String[] args) {
		String str="WELCOME TO TO BANGALORE FOR JOB TO JOB";
		String[] str1 = str.split(" ");
		
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		for (int i = 0; i < str1.length; i++) {
			set.add(str1[i]);
		}
		
		for (Object obj : set) {
			int count =0;
			for (int i = 0; i < str1.length; i++) {
				if (obj.equals(str1[i])) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(obj+" :- Unique String from the Sentence is :- "+count);
			}
		}
	}
}
