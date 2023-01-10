package stringPracticeProgram4;

public class PalendromOfStringsTest {
	public static void main(String[] args) {
		String str="MALAYALAM";
		char[] ch = str.toCharArray();
		String str2="";
		for (int i = ch.length-1 ; i >=0 ; i--) {
			str2=str2+ch[i];
		}
		if (str.equals(str2)) {
			System.out.println(str+" is a Palendrom String !");
		} else {
			System.out.println(str+" isnot a Palendrom String !");
		}
	}
}
