package stringPracticeProgramTest7;

public class PrintTheGivenStringOfEachWordReverselyTest {
	public static void main(String[] args) {
		String str="My Name Is Shubham";
		String[] strInput = str.split(" ");
		String strOutput="";
		for (int i = 0; i < strInput.length; i++) {
			String temp=strInput[i];
			for (int j = temp.length()-1 ; j >=0 ; j--) {
				strOutput=strOutput+temp.charAt(j);
			}
			strOutput=strOutput+" ";
		}
		System.out.println(strOutput);
	}
}
