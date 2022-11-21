package PractceBoard;

public class ReverseSentenceTest {
	public static void main(String[] args) {
		String str="Shubham is my name ";
		//String str1=""
		for (int i =str.length()-1  ; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
