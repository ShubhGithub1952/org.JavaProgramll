package stringPracticeProgram2;
/**
 * 
 * @author SHUBH
 * From Each String Count the Vowel and Print Max Vowel String
 */
public class PrintTheStringWichHasMaxVowels {
	public static void main(String[] args) {
		String str="my god name is google doddle ridiculous";
		String[] str1 = str.split(" ");
		String max="";
		int maxint=0;
		for (int i = 0; i < str1.length; i++) {
			int count=0;
			String str2=str1[i];
			char[] ch = str2.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j]=='a' ||ch[j]=='e' ||ch[j]=='i' ||ch[j]=='o' ||ch[j]=='u' ) {
					count++;
				}
			}
			if (maxint<=count) {
				maxint=count;
				max=str2;
			}
		}
		System.out.println(max);
		System.out.println(maxint);
	}
}
