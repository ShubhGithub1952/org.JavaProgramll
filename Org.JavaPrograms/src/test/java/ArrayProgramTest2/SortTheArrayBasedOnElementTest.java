package ArrayProgramTest2;

public class SortTheArrayBasedOnElementTest {
	public static void main(String[] args) {
		int [] abc= {1,0,0,1,0,1,0,1};
		int [] xyz= new int [abc.length];
		int m=0;
		int n=xyz.length-1;
		for (int i = 0; i < xyz.length; i++) {
			if (abc[i]==0) {
				xyz[m]=abc[i];
				m++;
			} else {
				xyz[n]=abc[i];
				n--;
			}
		}
	//	System.out.println("Sorted array as below...");
		for (int i = 0; i < xyz.length; i++) {
			System.err.print(xyz[i]+",");
		}
	}
}
