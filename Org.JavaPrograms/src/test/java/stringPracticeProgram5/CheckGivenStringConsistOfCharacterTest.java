	package stringPracticeProgram5;

public class CheckGivenStringConsistOfCharacterTest {
	public static void containsTest(String str) {
		String check="bha";
		boolean flag=false;
		for (int i = 0; i < str.length(); i++) {
			if (str.contains(check)) {
				if('b'==str.charAt(i)) {
					System.out.println("Given String Contains "+check+" at place of "+i);
				}
				
			}else {
				flag=true;
			}
		}
		if (flag) {
			System.out.println("Given String not Contains "+check);
		}
	}
	public static void main(String[] args) {
		containsTest("ABCtybha");
	}
}
