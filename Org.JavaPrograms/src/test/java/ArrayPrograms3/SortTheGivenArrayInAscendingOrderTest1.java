package ArrayPrograms3;

public class SortTheGivenArrayInAscendingOrderTest1 {
	public static void main(String[] args) {
		int [] numb= {30,50,40,10,20,60};
		for (int i = 0; i < numb.length; i++) {
			for (int j = i+1; j < numb.length; j++) {
				if (numb[i]>numb[j]) {
					int temp=numb[i];
					numb[i]=numb[j];
					numb[j]=temp;
				}
			}
		}
		System.out.println("Sorted Numb Array as below....");
		for (int i = 0; i < numb.length; i++) {
			System.out.print(numb[i]+",");
		}
	}
}
