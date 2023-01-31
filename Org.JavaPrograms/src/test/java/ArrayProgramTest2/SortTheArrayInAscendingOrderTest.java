package ArrayProgramTest2;

public class SortTheArrayInAscendingOrderTest {
	public static void main(String[] args) {
		int [] order= {10,50,30,40,20};
		
		for (int i = 0; i < order.length; i++) {
			for (int j = i+1; j < order.length; j++) {
				if (order[i]>order[j]) {
					int temp=order[i];
					order[i]=order[j];
					order[j]=temp;
				} 
			}
		}
		System.out.println("Given Sorted Order array is...");
		for (int i = 0; i < order.length; i++) {
			System.out.print(order[i]+",");
		}
	}
}
