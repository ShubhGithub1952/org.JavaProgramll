package scannerClassPrograms;

import java.util.Scanner;

public class CheckGivenNumberIsEvenOrOddFromUserValueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the integer need toCheck....");
		int numb = sc.nextInt();
		if (numb%2==0) {
			System.out.println("Given number is Even Number !");
		}else {
			System.out.println("Given number isnot Even Number !");
		}
	}
}
