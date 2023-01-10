package stringPracticeProgram4;

public class PreseveTheReverseStringTest {
	
	public static void reverse(String reverse) {
		char[] inputArray = reverse.toCharArray();
		char [] resultArray= new char[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]==' ') {
				resultArray[i]=' ';
			}
		}
		
		int j=resultArray.length-1;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]!=' ') {
				if(resultArray[j]==' ') 
				 {
					j--;
				 }
				resultArray[j]=inputArray[i];
				j--;
			}
		}
		// Print the ReverseArray
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]);
		}
	}
	public static void main(String[] args) {
		PreseveTheReverseStringTest.reverse("my name is shubham");
		System.out.println();
		PreseveTheReverseStringTest.reverse("my name is rahul");
	}
}
