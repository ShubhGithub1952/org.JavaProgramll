package stringPracticePrograms8;

public class ReverseTheGivenStringTest1 {

	public static void main(String[] args) {
		String str="My Name is Shubham From Maharashtra";
		String[] tempStr=str.split(" ");
		String finalStr="";
		for (int i = 0; i < tempStr.length; i++) {
			String srcStr = tempStr[i];
			for (int j = srcStr.length()-1 ; j >= 0 ; j--) {
				finalStr=finalStr+srcStr.charAt(j);
			}
			finalStr=finalStr+" ";
		}
		System.out.println(finalStr);
	}

}
