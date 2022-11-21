package PracticeOnBoard3;

public class ProgramString3OnSpace {
	public static void main(String[] args) {
		String str="fabul ous facts";
		// stc asf uol ubaf
		for (int i = str.length()-1; i >= str.length()-3; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
		for (int i = str.length()-4; i >= str.length()-5; i--) {
			System.out.print(str.charAt(i));
		}
		
		for (int i = str.length()-7; i >= str.length()-7; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
		
		for (int i = str.length()-8; i >= str.length()-9; i--) {
			System.out.print(str.charAt(i));
		}
		for (int i = str.length()-11; i >= str.length()-11; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
		for (int i = str.length()-12; i >= str.length()-15; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
