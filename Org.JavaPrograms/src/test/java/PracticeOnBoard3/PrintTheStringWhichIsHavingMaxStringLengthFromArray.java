package PracticeOnBoard3;

public class PrintTheStringWhichIsHavingMaxStringLengthFromArray {
	
	public static void main(String[] args) {
		
		String [] str={"om","satish","rohank","shubham"};
		String max=str[0];
		for (int i = 0; i < str.length; i++) {
			if (max.length()<str[i].length()) {
				max=str[i];
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			if (max.length()==str[i].length()) {
				System.out.println(str[i]+" :- has Highest Length in String Array !");
			}
		}
	}
}
