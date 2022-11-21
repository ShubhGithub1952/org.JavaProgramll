package stringPracticeProgram2;

public class CheckTheStringPresentInsideTheAnotherString {
	public static void main(String[] args) {
		String str1="Qwikcilver solution";
		String str2="wik";
		String str3 = str1.replace(" ", "");
		System.out.println(str3);
		char[] str4 = str3.toCharArray();
		boolean flag=false;
		//int count=0;
		for (int i = 0; i < str4.length; i++) {
			if (str4[i]==str2.charAt(0) || str4[i]==str2.charAt(1) || str4[i]==str2.charAt(2)) {
				flag=true;
				
			}
		}
		if (flag==true) {
			System.out.println(str2+" is Present inside the "+str1);
		}
	}
}
