package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingTest {
	@Test(dataProvider = "testData")
	public void retestTestData(String firstName, String middleName, String lastName) {
		System.out.println(firstName+" "+middleName+" "+lastName);
	}
	@DataProvider
   public Object[][] testData() {
	    Object[][] objArray = new Object[4][3];
	    objArray[0][0]="Shubham";
	    objArray[0][1]="Balaji";
	    objArray[0][2]="Pitale";
	    
	    objArray[1][0]="Satish";
	    objArray[1][1]="Balaji";
	    objArray[1][2]="Patil";
	    
	    objArray[2][0]="ShuShant";
	    objArray[2][1]="Sanjay";
	    objArray[2][2]="Surwase";
	    
	    objArray[3][0]="Sanket";
	    objArray[3][1]="Sanjay";
	    objArray[3][2]="Surwase";
	    	
	    return objArray;
   }
}
