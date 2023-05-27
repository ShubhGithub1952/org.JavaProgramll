package stringPracticeProgramTest7;

public class PreserveTheSpaceAndPrintReverseStringTest {
	public static void main(String[] args) {
		String str="My Name Is Shubham";
		//String str2="pit16@gmail.com";
		char[] chInput = str.toCharArray();
		char[] chOutput= new char[chInput.length];
		//Create a loop to add space as it is inside ChOutput Array
		for (int i = 0; i < chInput.length; i++) {
			if (chInput[i]==' ') {
				chOutput[i]=chInput[i];
			}
		}
		
		int reverse=chOutput.length-1;
		//Create loop for add reverse Values into the chOutput array
		for (int i = 0; i < chInput.length; i++) {
			if (chInput[i]!=' ') {
				if (chOutput[reverse]==' ') {
					reverse--;
				}
				chOutput[reverse]=chInput[i];
				reverse--;
			}
		}
		//Preserve the space and Print the chOutput array 
		for (int i = 0; i < chOutput.length; i++) {
			System.out.print(chOutput[i]);
		}
	}
}
