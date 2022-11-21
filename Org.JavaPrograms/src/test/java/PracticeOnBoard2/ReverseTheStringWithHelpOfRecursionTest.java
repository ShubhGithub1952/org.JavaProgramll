package PracticeOnBoard2;

public class ReverseTheStringWithHelpOfRecursionTest {
	static int n;
	public static void main(String[] args) {
		String str="MAHARASHTRA";
		n=str.length()-1;
		recursion(str);
	}
	
	public static void recursion(String str) {
		
		if (n>=0) {
			System.out.print(str.charAt(n));
			n--;
			recursion(str);
		}	
		
	}
}
