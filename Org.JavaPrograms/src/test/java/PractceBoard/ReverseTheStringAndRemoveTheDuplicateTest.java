package PractceBoard;

import java.util.LinkedHashSet;

public class ReverseTheStringAndRemoveTheDuplicateTest {
	public static void main(String[] args) {
		String str="satish";
		String str1=" ";
		for (int i = str.length()-1; i >=0 ; i--) {
			str1=str1+str.charAt(i);
		}
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str1.length(); i++) {
			set.add(str1.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}
