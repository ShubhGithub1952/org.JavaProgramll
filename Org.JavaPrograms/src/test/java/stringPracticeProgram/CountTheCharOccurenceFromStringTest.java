package stringPracticeProgram;
/**
 * 
 * @author SHUBH
 *  i/p :- aabbbccccda 
 *  o/p :- a2b3c4d1a1
 */
public class CountTheCharOccurenceFromStringTest {
	public static void main(String[] args) {
		String str="aabbbccccdas";
		char[] ch = str.toCharArray();
		int size = ch.length;
		int count =0;
		for (int i = 0; i < ch.length-1; i++) {
			if (ch[i]==ch[i+1]) {
				count++;
			}else {
				count++;
				System.out.print(""+ch[i]+count);
				count=0;
			}
		}
	}
}
