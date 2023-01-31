package stringPracticePrograms8;

public class VerifywhetherGivenStringIsPalendromOrNotTest1 {
	public static void main(String[] args) {
		String str="MALAYALAM";
		char[] tempChar = str.toCharArray();
		String finalStr="";
		for (int i = tempChar.length-1 ; i >=0 ; i--) {
			finalStr=finalStr+tempChar[i];
		}
		if (finalStr.equals(str)) {
			System.out.println("Given String is Palendrom !");
		}else {
			System.out.println("Given String isnot Palendrom !");
		}
	}
}
