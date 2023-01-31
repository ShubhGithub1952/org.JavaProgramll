package stringPracticeProgramTest7;

public class CheckGivenStringIsPalendromOrNotTest {
	public static void main(String[] args) {
		String str="MALAYAOLAM";
		char[] chTemp = str.toCharArray();
		String outputStr="";
		for (int i = chTemp.length-1 ; i >=0 ; i--) {
			outputStr=outputStr+chTemp[i];
		}
		if (outputStr.equals(str)) {
			System.out.println("Given "+str+" is a Palendrom !");
		} else {
			System.out.println("Given "+str+" is not a Palendrom !");
		}
	}
}
