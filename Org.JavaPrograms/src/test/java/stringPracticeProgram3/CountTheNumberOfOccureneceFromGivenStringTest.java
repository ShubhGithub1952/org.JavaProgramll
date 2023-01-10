package stringPracticeProgram3;

public class CountTheNumberOfOccureneceFromGivenStringTest {
	public static void main(String[] args) {
		String str ="GOOD MORNING HAVE A GREAT DAY";
		String str2 = str.replace(" ", "");
		char[] ch = str2.toCharArray();
		int size = ch.length;
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i+1 ; j < size; j++) {
				if (ch[i]==ch[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					size--;
				}
			}
			if (count==3) {
				System.out.println(""+ch[i]+count);
			}
		}
	}
}
