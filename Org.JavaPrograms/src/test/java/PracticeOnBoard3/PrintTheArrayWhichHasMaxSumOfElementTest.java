package PracticeOnBoard3;

public class PrintTheArrayWhichHasMaxSumOfElementTest {
	public static void main(String[] args) {
		int[][] a= {{2,6,3},{5,3,2},{8,5,2}};
		int maxsum=10;
		for (int i = 0; i < a.length; i++) {
			  int[]b= a[i];
			  int sum=0;
			for (int j = 0; j < b.length; j++) {
				sum=sum+b[j];
			}
			if (sum<maxsum) {
				maxsum=sum;
			}
		}
		for (int i = 0; i < a.length; i++) {
			int [] b=a[i];
			int sum=0;
			for (int j = 0; j < b.length; j++) {
				sum=sum+b[j];
				}
			if (sum==maxsum) {
				for (int k = 0; k < b.length; k++) {
					System.out.print(b[k]+" ");
				}
			}
		}
	}
}
