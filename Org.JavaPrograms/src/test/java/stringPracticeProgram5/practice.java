package stringPracticeProgram5;

public class practice {

	public static void main(String[] args) 
	{
		String str="RAMAYANA AND MAHABHARAT";
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length-1; i++) 
		{
			if(chr[i]==' ') 
			{
				continue;
			}
			else
			{	
				for(int j = i-1; j>=0; j--) 
				{
					if(chr[i]==chr[j]) 
					{
						System.out.println("hi");
						break;
					}
				}
				int count = 1;
				for (int j = i+1; j < chr.length; j++) 
				{
					if(chr[i]==chr[j]) 
					{
						count++;
					}
				}
				System.out.println(count+" "+ chr[i]);
			}
		}
		
		
	}

}
