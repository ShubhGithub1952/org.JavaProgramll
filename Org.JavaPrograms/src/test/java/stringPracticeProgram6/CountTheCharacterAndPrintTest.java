package stringPracticeProgram6;

public class CountTheCharacterAndPrintTest {
	public static void main(String[] args) {
		String str="aabbbccccdabdd";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=1;
			try {
				while (ch[i]==ch[i+1]) {
					count++;
					i++;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(""+ch[i]+count);
		}
	}
}
