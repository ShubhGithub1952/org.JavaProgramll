package stringPracticeProgram2;

public class B extends A{
	public void methodB() {
		System.out.println("I am in method B");
	}
	public static void main(String[] args) {
		B b = (B) new A();
		b.methodA();
		b.methodB();
	}
}
