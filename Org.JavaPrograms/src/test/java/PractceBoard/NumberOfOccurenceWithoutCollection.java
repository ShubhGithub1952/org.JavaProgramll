package PractceBoard;

public class NumberOfOccurenceWithoutCollection {
	public static void main(String[] args) {
		String str="INDIA";
		char [] ch=str.toCharArray();
		int n=ch.length;
		for (int i = 0; i < n; i++) {
				int count=1;
			for (int j = i+1; j < n; j++) {
				
				if (ch[i]==ch[j]) {
					
					count++;
					System.out.println(count);
					int k=j;
					while (k<n-1) {
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					n--;
				}
			}
			System.out.println(ch[i]+" Count :- "+count);
		}
	}
}
