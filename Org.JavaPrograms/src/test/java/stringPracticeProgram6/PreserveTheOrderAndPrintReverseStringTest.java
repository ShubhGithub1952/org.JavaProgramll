package stringPracticeProgram6;

public class PreserveTheOrderAndPrintReverseStringTest {
	public static void main(String[] args) {
		String str="My Name is Shubham";
		char[] inputArray = str.toCharArray();
		char [] outputArray= new char[inputArray.length];
		// So wherever the Space are there in str store that space inside
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]==' ') {
				outputArray[i]=inputArray[i];
			}
		}
		//We have to store inputArray in reverse order
		int size = outputArray.length-1;
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]!=' ') {
				if(outputArray[size]==' ') {
					size--;
				}
				outputArray[size]=inputArray[i];
				size--;
			}
		}
		
		// To print the outputArray
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
	}
}
