package stringPracticeProgram5;

public class PreserveTheStringAndPrintReverseStringTest {
	public static void main(String[] args) {
		String str="My Name is Shubham";
		// Store given String into character Array
		char[] inputArray = str.toCharArray();
		// Create the Empty Array of Same size as InputArray
		char [] outputArray= new char[inputArray.length];
		// Store the Space of inputArray inside of OutputArray as it is
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]==' ') {
				outputArray[i]=inputArray[i];
			}
		}
		// if we want to store inputArray reverse into the outputArray
		int j=outputArray.length-1;
		
		//Now store the Character of inputArray inside OutputArray
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]!=' ') {
				//already we Stored spaces inside outputArray so we have to decrese size of Array
				if (outputArray[j]==' ') {
					j--;
				}
				outputArray[j]=inputArray[i];
				j--;
			}
		}
		// To print the outputArray 
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
	}
}
