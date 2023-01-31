package stringPracticePrograms8;

public class CountTheNumberOfCharacterHasBeenRepeatedTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MALAYALAM IS A LANGUAGE";
		String srcStr = str.replace(" ","");
		char[] tempStr = srcStr.toCharArray();
		int size = tempStr.length;
		for (int i = 0; i < size ; i++) {
			int count=1;
			for (int j = i+1 ; j < size ; j++) {
				if (tempStr[i]==tempStr[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						tempStr[k]=tempStr[k+1];
						k++;
					}
					j--;
					size--;
				} 
			}
			System.out.println(tempStr[i]+" :- "+count);
		}
	}

}
