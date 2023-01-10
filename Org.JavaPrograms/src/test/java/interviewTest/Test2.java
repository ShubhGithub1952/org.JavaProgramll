package interviewTest;

public class Test2 extends Test1 {
	public void test() {
		 System.out.println("From Child class Passing New implementation !");
	 }
	public static void main(String[] args) {
		Test1 obj = new Test2();
		obj.test();
		obj.test(10);
	}
}
