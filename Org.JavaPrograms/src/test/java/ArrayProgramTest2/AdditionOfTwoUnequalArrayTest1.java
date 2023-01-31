package ArrayProgramTest2;

public class AdditionOfTwoUnequalArrayTest1 {
	public static void main(String[] args) {
		int [] abc= {1,3,5,2,4};
		int [] xyz= {4,1,3,5,2,9,7};
		if (xyz.length>=abc.length) {
			for (int i = 0; i < xyz.length; i++) {
				try {
					xyz[i]=xyz[i]+abc[i];
				} catch (Exception e) {
					if (abc.length<=xyz.length) {
						xyz[i]=xyz[i];
					}
				}
			}
		}
		
		System.out.println("Addition of Two unequal Array as below..");
		for (int i = 0; i < xyz.length; i++) {
			System.out.print(xyz[i]+",");
		}
	}
}
