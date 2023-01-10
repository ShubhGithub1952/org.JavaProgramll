package stringPracticeProgram5;

public class CheckGivenStringArrayIsPrimeOrNotTEst {
	public static void main(String[] args) {
		String [] str= {"1","3","5","4","6","7"};
		for (int i = 0; i < str.length; i++) {
			int num = Integer.parseInt(str[i]);
			//System.out.println(num);
			int numb=num;
			int temp=2;
			int count=0;
			while (temp<=numb/2) {
				if (numb%temp==0) {
					count++;
					break;
				}
				temp++;
			}
			if (count==1) {
				System.out.println(str[i]+" isnot a Prime Number !");
			} else {
				System.out.println(str[i]+" is a Prime Number !");
			}
		}
	}
}
