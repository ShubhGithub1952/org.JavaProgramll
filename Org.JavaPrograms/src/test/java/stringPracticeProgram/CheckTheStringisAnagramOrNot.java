package stringPracticeProgram;

public class CheckTheStringisAnagramOrNot {
	
	public static void main(String[] args) {
		String str="LISTEN";
		String str1="SILENT";
		int length1=0;
		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			for (int j = i+1; j < ch1.length; j++) {
				if (ch1[i]>ch1[j]) {
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
		for (int i = 0; i < ch2.length; i++) {
			for (int j = i+1; j < ch2.length; j++) {
				if (ch2[i]>ch2[j]) {
					char temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}

		if (ch1.length==ch2.length) {
			length1 = ch1.length;
		}
		for (int i = 0; i <length1; i++) {
			if (ch1[i]==ch2[i]) {
				System.out.println("Given String is Anagram !");
			}else {
				System.out.println("Given String isnot Anagram !");
			}
		}
		
	}
}
