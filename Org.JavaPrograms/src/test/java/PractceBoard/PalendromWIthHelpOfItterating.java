package PractceBoard;

import java.util.ArrayList;
import java.util.Iterator;

public class PalendromWIthHelpOfItterating {
	public static void main(String[] args) {
		String str="lakan";
		String str1 = str.toLowerCase();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = str.length()-1; i >=0 ; i--) {
			list.add(str.charAt(i));
		}
		int count=0;
		Iterator<Character> it = list.iterator();
		while (it.hasNext()) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i)==it.next()) {
					count++;
				}
			}
			if (count==str.length()) {
				System.out.println("PAlendrom"+count);
			}else {
				System.out.println("Not Palindrom");
			}
		}
	}
	
}
