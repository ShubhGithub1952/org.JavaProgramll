package org.StringsPrograms;

public class PrintAlphabetFromAtoZ {
	public static void main(String[] args) {
		char ch='A';
		char ch1='Z';
		while (ch<=ch1) {
			System.out.println(ch);
			ch++;
		}
		for ( ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
