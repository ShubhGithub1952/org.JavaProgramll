package ArrayPrograms3;

public class SortTheElementsFromArrayTest1 {
	public static void main(String[] args) {
		int [] numb= {0,1,0,1,1,0,0,1};
		int [] dumb= new int[numb.length];
		int m=0;
		int n=numb.length-1;
		for (int i = 0; i < numb.length; i++) {
			if (numb[i]==0) {
				dumb[m]=numb[i];
				m++;
			} else {
				dumb[n]=numb[i];
				n--;
			}
		}
		System.out.println("Sorted Array as below...");
		for (int i = 0; i < dumb.length; i++) {
			System.out.print(dumb[i]+",");
		}
	}
}
