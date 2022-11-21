package stringPracticeProgram;


public class SplitingTheStringandPrintReverseTest {
	public static void main(String[] args) {
		String str="good morning";
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		String rev="";
		for (int i = 0; i < str1.length(); i++) {
			rev=str1.charAt(i)+rev;
		}
		System.out.println(rev);
		 String rev1 = rev.substring(0, 4);
		 System.out.println(rev1);
		 String rev2 = rev.substring(4,8 );
		 System.out.println(rev2);
	}
}
