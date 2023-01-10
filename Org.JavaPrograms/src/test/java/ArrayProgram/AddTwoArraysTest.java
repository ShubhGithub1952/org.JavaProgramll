package ArrayProgram;

public class AddTwoArraysTest {
	public static void main(String[] args) {
		int [] numb= {2,4,5,1,2};
		int [] dumb= {1,5,4,2,6,5,2};
		if (dumb.length>=numb.length) {
			for (int i = 0; i < dumb.length; i++) {
				try {
					dumb[i]=dumb[i]+numb[i];
				} catch (Exception e) {
				if (numb.length<=dumb.length) {
					dumb[i]=dumb[i];
				}
				}
			}
		}
		for (int i = 0; i < dumb.length; i++) {
			System.out.print(dumb[i]+",");
		}
		
	}
}
