package org.StringsPrograms;

public class PalendromOfStringTest {
	public static void main(String[] args) {
		String str="MALAYALAM";
		String rev="";
		for (int i = str.length()-1 ; i >=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("Given String is Palendrom ");
		}else {
			System.out.println("Given String isnot Palendrom ");
		}
	}
}
