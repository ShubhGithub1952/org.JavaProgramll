package stringPracticeProgram;

public class PrintTheStringWhichHasHighestVowelsTest {
	public static void main(String[] args) {
		String str="my god name is google doddle ridiculous";
		String[] str1 = str.split(" ");
		String max="";
		int maxint=1;
		String min="";
		int minint=1;
		for (int i = 0; i < str1.length; i++) {
			String str2 = str1[i];
			int count=0;
			char[] ch = str2.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' ) {
					count++;
				}
			}
			if (maxint<=count) {
				maxint=count;
				max=str2;
			}
			if (minint>=count) {
				minint=count;
				min=str2;
			}
		}
		System.out.println(maxint);
		System.out.println(max);
		System.out.println(minint);
		System.out.println(min);
	}
}
