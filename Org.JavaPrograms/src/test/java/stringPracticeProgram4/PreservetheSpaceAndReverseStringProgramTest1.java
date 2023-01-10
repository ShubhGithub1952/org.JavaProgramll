package stringPracticeProgram4;

public class PreservetheSpaceAndReverseStringProgramTest1 {

	public static void main(String[] args) {
		String str="My name is Shubham";
		          //ma hbuh Ss iemanyM
		// along with space store string inside Array
		char[] inputArray = str.toCharArray();

		//create another Array of same size that of inputArray
		char [] resultArray= new char[inputArray.length];

		//Store the space same as from inputArray into resultArray
		for (int i = 0; i < resultArray.length; i++) {
			if (inputArray[i]==' ') {
				resultArray[i]=inputArray[i];
			}
		}

		// first character of inputArray we will store inside last place of resultArray
		int j=resultArray.length-1;
		for (int i = 0; i < inputArray.length; i++) {
			// Already we have 3 space inside resultArray and inputArray also have 3space, So decrement those 3 space
			if (inputArray[i]!=' ') {
				//already resultArray has stored Space, we have to Remove that space
				if(resultArray[j]==' ') 
				{ 
					j--;
				}
				resultArray[j]=inputArray[i];
				j--;
			}
		}

		//Print the resultArray
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]);
		}
	}
}
