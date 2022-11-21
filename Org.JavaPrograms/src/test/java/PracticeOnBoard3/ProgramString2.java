package PracticeOnBoard3;

public class ProgramString2 {
	public static void main(String[] args) {
		String str="ram gopal";
		for (int i = str.length()-1; i >=str.length()-3 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
		for (int i = str.length()-4; i >=str.length()-5 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		for (int i = str.length()-7; i >=str.length()-9 ; i--) {
			System.out.print(str.charAt(i));
		}
	
	}
}
