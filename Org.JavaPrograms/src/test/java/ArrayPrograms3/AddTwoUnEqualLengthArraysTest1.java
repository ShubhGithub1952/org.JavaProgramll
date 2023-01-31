package ArrayPrograms3;

public class AddTwoUnEqualLengthArraysTest1 {
	public static void main(String[] args) {
		int [] numb= {1,5,3,2,4};
		int [] dumb= {5,3,4,5,2,6,9,8};
		if (numb.length<dumb.length) {
			for (int i = 0; i < dumb.length; i++) {
				try {
					dumb[i]=dumb[i]+numb[i];
				} catch (Exception e) {
					// TODO: handle exception
					if (numb.length<dumb.length) {
						dumb[i]=dumb[i];
					}
				}
			}
		}
		System.out.println(" Addtion of Two Unequal Length array as below !");
		for (int i = 0; i < dumb.length; i++) {
			System.out.print(dumb[i]+",");
		}
	}
}
