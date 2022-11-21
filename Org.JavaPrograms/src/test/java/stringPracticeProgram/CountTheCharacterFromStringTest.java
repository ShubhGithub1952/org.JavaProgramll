package stringPracticeProgram;

public class CountTheCharacterFromStringTest {
	public static void main(String[] args) {
		String str="aaabbcddda";
		int count=0;
		for (int j = 0; j < str.length()-1; j++) {
			
			if (str.charAt(j)==str.charAt(j+1)) {
				count++;
			}
			else {
				count++;
				System.out.print(""+str.charAt(j)+count);
				count=0;
			}
		}
		count++;
		System.out.println(""+str.charAt(str.length()-1)+count);
	}
}
