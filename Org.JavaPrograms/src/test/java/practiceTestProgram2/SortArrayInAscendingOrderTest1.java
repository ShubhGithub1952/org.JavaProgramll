package practiceTestProgram2;

public class SortArrayInAscendingOrderTest1 {
	public static void main(String[] args) {
		int [] numb= {10,50,30,40,20};
		for (int i = 0; i < numb.length; i++) {
			for (int j = i+1 ; j < numb.length; j++) {
				if (numb[i]>numb[j]) {
					int temp=numb[i];
					numb[i]=numb[j];
					numb[j]=temp;
				}
			}
		}
		
		System.out.println("Sorting Order of given Array as below..");
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);
		}
	}
}
