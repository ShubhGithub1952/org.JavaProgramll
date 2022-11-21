package PractceBoard;

public class ReverseTheStringWithHelpOfRecursionTest {
	static int n;
	public static void main(String[] args) {
		String str="MAHARASHTRA";
		n=str.length()-1;
		reverse(str);
	}
	
	static public void reverse(String str) {
		if (n>=0) {
			System.out.print(str.charAt(n));
			n--;
			reverse(str);
		}
	}
}
