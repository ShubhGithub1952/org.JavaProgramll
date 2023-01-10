package stringPracticeProgram5;

public class CheckIfGivenNumberISPrimeNumberOrNOt {
	public static void main(String[] args) {
		int numb=19;
		int check=2;
		int count=0;
		while (check<=numb/2) {
			if (numb%check==0) {
				count++;
				break;
			}
			check++;
		}
		if (count==1) {
			System.out.println("Given Number is not a Prime Number");
		} else {
			System.out.println("Given Number is a Prime Number");
		}
		
	}
}
