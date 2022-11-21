package org.StringsPrograms;

import java.util.LinkedHashSet;

public class dshj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="sangamesh";
		StringBuilder str=new StringBuilder(a);
		StringBuilder tr = str.reverse();
		String f=new String(tr);
		System.out.println(tr);
		LinkedHashSet<Character> sgd = new LinkedHashSet<Character>();
		
		int gd = f.length();
		for (int i = 0; i < gd; i++) {
			sgd.add(tr.charAt(i));
		} 
			
for (Character character : sgd) {
			System.out.print(character);
		}

	}

}
