package stringPracticeProgram6;

public class PrintTheReverseWordsFromGivenStringTest {
	public static void main(String[] args) {
		String str="My Name Is Shubham Balaji Pitale";
		String[] str2 = str.split(" ");
		String str3="";
		for (int i = 0; i < str2.length; i++) {
			String tempString = str2[i];
			for (int j = tempString.length()-1; j >=0 ; j--) {
				str3=str3+tempString.charAt(j);
			}
			str3=str3+" ";
		}

		System.out.println(str3);
	}
}
