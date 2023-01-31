package ArrayPrograms3;

public class CountTheNumberOfElementRepeatedFromArrayTest1 {

	public static void main(String[] args) {
		int [] numb= {1,4,2,5,1,4,3,5,1,4,2};
		int size=numb.length;
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i+1; j < size; j++) {
				if (numb[i]==numb[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						numb[k]=numb[k+1];
						k++;
					}
					j--;
					size--;
				}
			}
			System.out.println(numb[i]+" :- "+count);
		}
	}

}
