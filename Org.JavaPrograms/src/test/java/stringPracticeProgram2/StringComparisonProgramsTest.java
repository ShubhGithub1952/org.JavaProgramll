package stringPracticeProgram2;

public class StringComparisonProgramsTest {
	public static void main(String[] args) {
		String str1="Qwikcilver";
		String str2=str1;
		String str3= new String("Qwikcilver");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str1);
	}
}
