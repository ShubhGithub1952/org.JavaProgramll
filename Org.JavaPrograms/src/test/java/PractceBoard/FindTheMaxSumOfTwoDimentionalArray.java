package PractceBoard;

public class FindTheMaxSumOfTwoDimentionalArray {
	public static void main(String[] args) {
		int [] []a = {{1,2,3},{4,5,6},{6,7,8}};
		int maxsum=0;
		for (int i = 0; i < a.length; i++) {
			int[] b = a[i];
			int sum=0;
			for (int j = 0; j < b.length; j++) {
				sum=sum+b[j];
				if (sum>maxsum) {
					maxsum=sum;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			int [] b=a[i];
			int sum=0;
			for (int j = 0; j < b.length; j++) {
				sum=sum+b[j];
			}
			if (sum==maxsum) {
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[j]+", ");
				}
			} 
		}
	}
}
