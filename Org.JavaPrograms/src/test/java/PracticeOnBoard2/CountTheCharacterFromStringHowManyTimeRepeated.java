package PracticeOnBoard2;

import java.util.LinkedHashSet;

public class CountTheCharacterFromStringHowManyTimeRepeated {
	public static void main(String[] args) {
		String str="INDIA";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			//System.out.println(ch);
			for (int i = 0; i < str.length(); i++) {
				if (ch.equals(str.charAt(i))) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(ch+" has Count :- "+count);
			}
		}
	}
}
