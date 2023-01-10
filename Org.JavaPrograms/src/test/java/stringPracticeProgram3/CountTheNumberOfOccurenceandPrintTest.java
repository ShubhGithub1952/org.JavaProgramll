package stringPracticeProgram3;
/**
 * 
 * @author SHUBH
 *
 *    i/p :-  aabcccdddda
 *    o/p :-  a2b1c3d4a1
 */
public class CountTheNumberOfOccurenceandPrintTest {
	public static void main(String[] args) {
	  String str="aabcccdddda";
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