package org.StringsPrograms;

public class RemoveTheDuplicatesFromString {
	public static void main(String[] args) {
		String str="this is my test string";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < str.length(); i++) {
//			set.add(str.charAt(i));
//		}
//		
//		for (Character ch : set) {
//			int count=0;
//			for (int i = 0; i < str.length(); i++) {
//				if (ch.equals(str.charAt(i))) {
//					count++;
//				}
//			}
//			if (count<2) {
//				System.out.println(ch);
//			}
//		}
//		
		
		
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(str.charAt(i));
			}
		}
		

	}
}
