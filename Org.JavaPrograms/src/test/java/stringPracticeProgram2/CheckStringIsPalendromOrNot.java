package stringPracticeProgram2;

public class CheckStringIsPalendromOrNot {
	public static void main(String[] args) {
		String str="lokoil";
		String str2="";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >0 ; i--) {
			str2=str2+ch[i];
			}
		//System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println(str+" is a Palendrom ! ");
		}else {
			System.out.println(str+" isnot a Palendrom ! ");
		}
	}
}
