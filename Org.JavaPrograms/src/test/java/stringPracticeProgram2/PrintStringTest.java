package stringPracticeProgram2;
/**
 * 
 * @author SHUBH
 *  i/p aababbabaabb
 *  o/p aabbaabbaabbaa
 */
public class PrintStringTest {
	public static void main(String[] args) {
		String str="aababbabaabb";
		char[] ch = str.toCharArray();
		String str1="";
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			//System.out.print(ch[i]);
			str1=str1+ch[i];
		}
		System.out.println("i/p :- "+str);
		
			String a1=str1.substring(0,2);
			//System.out.println(a1);
			String b1=str1.substring(6,8);
			//System.out.println(b1);
			String a2=str1.substring(2,4);
			//System.out.println(a2);
			String b2=str1.substring(8,10);
			//System.out.println(b2);
			String a3=str1.substring(4,6);
			//System.out.println(a3);
			String b3=str1.substring(10,12);
			//System.out.println(b3);
			String str3=a1+b1+a2+b2+a3+b3;
			System.out.println("o/p :- "+str3);
	}
}
