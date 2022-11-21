package patternProgram1;

public class NumberPattern2 {
	public static void main(String[] args) {
		int n=5;
		int num=6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print((num++%5)+1+" ");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
