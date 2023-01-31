package superAndthisKeywordTest;

public class SuperKeywordSubclassTest1 extends SuperKeywordTest1 {
	String str="Shubham BP";
	
	public void superTest() {
    	System.out.println("From SubClass Super Test");
    	System.out.println(str);
    	super.superTest();
    	System.out.println(super.str);
    } 
}
