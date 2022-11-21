package stringPracticeProgram;

public class CountTheOccurenceOfCharFromString {
	public static void main(String[] args) {
		String str="Good MorninG";
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
			System.out.println(ch[i]+" :- "+count+", ");
//			if (count==2) {
//				System.out.println(ch[i]+" :- "+count+", ");
//			}
//			//System.out.println(ch[i]+" :- "+count+", ");
		}
	}
//	{
//		String str1="shubham";
//		char[] ch1 = str1.toCharArray();
//		int size1 = ch1.length;
//		for (int i = 0; i < size1; i++) {
//			int count=1;
//			for (int j = i+1; j < size1; j++) {
//				if (ch1[i]==ch1[j]) {
//					count++;
//					int k=j;
//					while (k<size1-1) {
//						ch1[k]=ch1[k+1];
//						k++;
//					}
//					j--;
//					size1--;
//				}
//			}
//			
//		}
//	}
}

