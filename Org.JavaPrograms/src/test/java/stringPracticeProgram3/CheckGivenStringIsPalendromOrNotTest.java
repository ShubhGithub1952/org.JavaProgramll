package stringPracticeProgram3;

public class CheckGivenStringIsPalendromOrNotTest {
	public static void main(String[] args) {
		String str ="MALAYIALAM";
		String str2="";
		for (int i =str.length()-1; i >= 0 ; i--) {
			str2=str2+str.charAt(i);
		}
		if (str2.contains(str)) {
			System.out.println("Palendrom");
		} else {
			System.out.println("Not Palendrom");
		}
	
	}
}
