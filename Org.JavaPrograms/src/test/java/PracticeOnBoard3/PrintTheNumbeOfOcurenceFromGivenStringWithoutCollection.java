package PracticeOnBoard3;

public class PrintTheNumbeOfOcurenceFromGivenStringWithoutCollection {
	public static void main(String[] args) {
		String str="aabbbccccddddd";
		char[] ch = str.toCharArray();
		int size = ch.length;
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i+1; j < size; j++) {
				if (ch[i]==ch[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						ch[k]=ch[k+1];
						k++;
					}
					size--;
					j--;
				}
			}
			System.out.println(ch[i]+" :- "+count);
		}
		
	}
}
