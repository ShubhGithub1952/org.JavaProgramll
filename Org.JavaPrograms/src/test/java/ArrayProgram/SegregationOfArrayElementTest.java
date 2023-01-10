package ArrayProgram;

public class SegregationOfArrayElementTest {
	public static void main(String[] args) {
		int [] num= {0,1,1,0,1,0};
		int [] temp= new int[num.length]; 
		int m=0;
		int n=temp.length-1;
		for (int i = 0; i < num.length; i++) {
			if (num[i]==0) {
				temp[m]=num[i];
				m++;
			}else {
				temp[n]=num[i];
				n--;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
