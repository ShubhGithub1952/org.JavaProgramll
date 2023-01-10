package stringPracticeProgram5;

public class PrintTheMaximumCharacterHasRepeatedTest {
	public static void main(String[] args) {
		String str="RAMAYANA AND MAHABHARAT";
		String str1 = str.replace(" ", "");
		char[] ch = str1.toCharArray();
		int size = ch.length;
		int maxCount=1;
		char maxChar='a';
		for (int i = 0; i < size; i++) {
			int count =1;
			for (int j = i+1; j < size; j++) {
				if (ch[i]==ch[j]) {
					count++;
					int k=j;
					while(k< size-1) {
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					size--;
				}
			}
			System.out.println(ch[i]+" :- "+count);
		}
	}
}
