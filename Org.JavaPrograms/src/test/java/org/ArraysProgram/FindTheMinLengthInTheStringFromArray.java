   package org.ArraysProgram;

public class FindTheMinLengthInTheStringFromArray {
	public static void main(String[] args) {
		String [] str= {"ashok","ram","om","shubham","sangmeshkumar"};
		String minLength=str[0];
		for (int i = 1; i < str.length; i++) {
			if (minLength.length()<str[i].length()) {
				minLength=str[i];
			}
		}
	   for (int i = 0; i < str.length; i++) {
		
	}
   }
}