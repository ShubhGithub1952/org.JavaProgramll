package org.PracticeProgram;

import java.util.LinkedHashSet;

public class PrintTheStringReversetest {
	public static void main(String[] args) {
		//String str=" Welcome to India Country";
		String[] str = {"java","C#",".net","java","C#"};
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		int count=0;
		for (String str1 : set) {
			
			for (int i = 0; i < str.length; i++) {
				if (str1.equals(str[i])) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(str1);
			}
			
		}
		
	}
}
