package stringPracticeProgram4;

public class ReverseAStringTest {
	public static void main(String[] args) {
		String str="my name is shubham";
		char[] ch = str.toCharArray();
		char[] resultArray= new char[ch.length];
		
		// Store the Space of ch inside of reverse array
		for (int i = 0; i < resultArray.length; i++) {
			if (ch[i]==' ') {
				resultArray[i]=' ';
			}
		}
		// Store the reverse length of Result Array
		int j= resultArray.length-1;
		// when ch don't have space that character store inside resultArray which has reverse length
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ') {
				if(resultArray[j]==' ') {
					j--;
				}
				resultArray[j]=ch[i];
				j--;
			}
		}
		
		//For Printing the resultArray
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]);
		}
		
	}
}
