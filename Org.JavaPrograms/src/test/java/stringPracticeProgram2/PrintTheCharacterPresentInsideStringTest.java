package stringPracticeProgram2;
/**
 * 
 * @author SHUBH
 *	i/p aabbbccccda
 *  o/p a2b3c4d1a1
 */
public class PrintTheCharacterPresentInsideStringTest {
	public static void main(String[] args) {
		String str="aabbbccccda";
		char[] ch = str.toCharArray();
//		int count=0;
//		for (int i = 0; i < ch.length-1; i++) {
//			if (ch[i]==ch[i+1]) {
//				count++;
//			}else {
//				count++;
//				System.out.print(""+ch[i]+count);
//				count=0;
//			}
//		}
//		count++;
//		System.out.println(""+ch[ch.length-1]+count);
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
			System.out.print(""+ch[i]+ count);
		}
		
	}
}
