package stringPracticeProgram6;

public class AdditionOfDigitInGivenStringTest1 {
	public static void main(String[] args) {
		String str="shubham122@gmail122com122";
		int tsum=0;
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
				int n=str.charAt(i)-48;
				tsum=tsum*10+n;
			} else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.print(sum);
	}
}
