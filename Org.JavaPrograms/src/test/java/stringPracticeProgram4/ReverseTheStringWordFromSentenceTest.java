package stringPracticeProgram4;

public class ReverseTheStringWordFromSentenceTest {
	public static void main(String[] args) {
		String str="I Have Two Four Wheelers";
		String[] str2 = str.split(" ");
		String str3="";
		for (int i = 0; i < str2.length; i++) {
			String temp = str2[i];
			for (int j = temp.length()-1; j >=0 ; j--) {
				str3=str3+temp.charAt(j);
			}
			str3=str3+" ";
		}
		System.out.println(str3);
	}
}
