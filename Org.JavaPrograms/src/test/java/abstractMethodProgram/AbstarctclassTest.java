package abstractMethodProgram;

abstract public class AbstarctclassTest {
	public abstract void test();
	public void page() {
		System.out.println("Inside the Page Method !");
	}
	public void bag() {
		System.out.println("Inside Bag Method !");
	}
}

class Driver extends AbstarctclassTest
{
	public static void main(String[] args) {
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
