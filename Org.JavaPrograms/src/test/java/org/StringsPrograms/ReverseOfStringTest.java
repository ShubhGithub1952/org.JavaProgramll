package org.StringsPrograms;

public class ReverseOfStringTest {
	public static void main(String[] args) {
		String s="bangalore";
		System.out.println("With the Help of charAt()");
		for (int i =s.length()-1 ; i >=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("With the Help Of toCharArray()");
		char [] ch=s.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("With the Help Of Empty String");
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
