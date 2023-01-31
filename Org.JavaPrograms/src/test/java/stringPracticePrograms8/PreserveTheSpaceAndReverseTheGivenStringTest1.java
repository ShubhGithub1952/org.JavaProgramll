package stringPracticePrograms8;

public class PreserveTheSpaceAndReverseTheGivenStringTest1 {
	public static void main(String[] args) {
		String str="My Name is Shubham from Maharashtra";
		char[] tempStr = str.toCharArray();
		//Create a empty array to add tempStr
		char [] finalStr= new char[tempStr.length];
		
		//Create a for loop to add the empty spaces into the FinalArray same as tempStr
		for (int i = 0; i < tempStr.length; i++) {
			if (tempStr[i]==' ') {
				finalStr[i]=tempStr[i];
			}
		}
		
		//Create 1 veriable to Store the element of tempStr reversely into the finalStr
		int size=finalStr.length-1;
		
		//Create the For loop to add the elements from the tempStr into the finalStr without space
		
		for (int i = 0; i < tempStr.length; i++) {
			if (tempStr[i]!=' ') {
				if(finalStr[size]==' ') {
					size--;
				}
				finalStr[size]=tempStr[i];
				size--;
			}
		}
		//Print the given finalStr array
		for (int i = 0; i < finalStr.length; i++) {
			System.out.print(finalStr[i]);
		}
	}
}
