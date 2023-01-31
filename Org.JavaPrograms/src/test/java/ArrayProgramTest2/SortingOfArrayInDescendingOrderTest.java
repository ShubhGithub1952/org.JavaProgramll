package ArrayProgramTest2;

public class SortingOfArrayInDescendingOrderTest {
	public static void main(String[] args) {
		int [] order= {50,10,30,20,40};
		for (int i = 0; i < order.length; i++) {
			for (int j = i+0; j < order.length; j++) {
				if (order[i]<order[j]) {
					int temp=order[i];
					order[i]=order[j];
					order[j]=temp;
				} 
			}
		}
		System.out.println("Sorted Array in Descendong order is ...");
			for (int i = 0; i < order.length; i++) {
				System.out.print(order[i]+",");
			}
	}
}
