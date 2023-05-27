package stringPracticeProgram6;

public class PreserveTheOrderAndPrintReverseStringTest {
	public static void main(String[] args) {
		String str="S*h#u@b%ha$m#";//"My Name is Shubham";
		char[] temp = str.toCharArray();
		//Create the Empty Array size as same as Temp Array
		char [] dest= new char[temp.length];
		
		//Add Space same space as it is available inside the temp array
		for (int i = 0; i < temp.length; i++) {
			if (temp[i]=='*'||temp[i]=='#'||temp[i]=='@'||temp[i]=='%'||temp[i]=='$') {
				dest[i]=temp[i];
			}
		}
		
		//To store elements of temp array inside the dest array
		try {
			int size= dest.length-1;
			for (int i = 0; i < temp.length; i++) {
				
				if(temp[i]!='*'||temp[i]!='#'||temp[i]!='@'||temp[i]!='%'||temp[i]!='$') {
					size--;
				}
				dest[size]=temp[i];
				size--;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//Print the dest Array or Print the O/P
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);
		}
	}
}
