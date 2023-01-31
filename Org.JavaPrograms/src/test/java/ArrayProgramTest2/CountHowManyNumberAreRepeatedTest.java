package ArrayProgramTest2;

public class CountHowManyNumberAreRepeatedTest {
	public static void main(String[] args) {
		int [] ch= {1,3,4,3,2,3,2,1,3,4,3,2,5};
		int size=ch.length;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i+1; j < size; j++) {
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
			System.out.println(ch[i]+" :- "+count);
		}
	}
}
