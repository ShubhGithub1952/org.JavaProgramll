package interviewTest;

public class ReverseStringTest {
	public static void main(String[] args) {
		String str="This is Bangalore City";
		char[] ch = str.toCharArray();
		char [] ch1= new char[ch.length];
		for (int i = ch.length-1 ; i >=0  ; i--) {
			//System.out.print(ch[i]);
			if (ch[i]=='a') {
				ch[i]='e';
			}else if (ch[i]=='e') {
				ch[i]='a';
			}else if (ch[i]=='i') {
				ch[i]='o';
			}else if (ch[i]=='o') {
				ch[i]='i';
			}
			ch1[i]=ch[i];
		}
		for (int i = ch1.length-1 ; i >=0 ; i--) {
			System.out.print(ch1[i]);
		}
	}
}
