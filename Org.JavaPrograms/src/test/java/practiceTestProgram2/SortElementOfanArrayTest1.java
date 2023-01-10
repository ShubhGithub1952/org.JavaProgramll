package practiceTestProgram2;

public class SortElementOfanArrayTest1 {
	public static void main(String[] args) {
		int []numb= {0,1,0,1,0,1,0,1};
		int [] temp= new int[numb.length];
		int m=0;
		int n=temp.length-1;
		for (int i = 0; i < numb.length; i++) {
			if (numb[i]==0) {
				temp[m]=numb[i];
				m++;
			} else {
				temp[n]=numb[i];
				n--;
			}
		}
		System.out.println("Sorted Array as below....");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
