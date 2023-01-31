package ArrayProgram;

public class SegregationOfArrayBasedOnElementTest {
	public static void main(String[] args) {
		int [] abc= {0,1,0,1,0,1,0,1,0};
		int [] xyz= new int[abc.length];
		int m=0;
		int n=abc.length-1;
		for (int i = 0; i < xyz.length; i++) {
			if (abc[i]==0) {
				xyz[m]=abc[i];
				m++;
			} else {
				xyz[n]=abc[i];
				n--;
			}
		}
		System.out.println("Sorted Array as below....");
		for (int i = 0; i < xyz.length; i++) {
			System.out.print(xyz[i]+",");
		}
	}
}
