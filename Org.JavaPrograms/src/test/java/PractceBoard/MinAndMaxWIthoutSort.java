package PractceBoard;

public class MinAndMaxWIthoutSort {

	public static void main(String[] args) {
		int[] a={2,3,1,2};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=fmin){
				if(a[i]!=fmin){
					smin=fmin;
				}fmin=a[i];
			}else if (fmin==smin||smin>a[i]){
				smin=a[i];
			}
		}
		System.out.println(fmin+" "+smin);
	}

}
