package practiceTestProgram1;

public class CountTheNumberOfObjectsFromClass {
	private static int count;
	
	public CountTheNumberOfObjectsFromClass() {
		count++;
	}
	
	public static void main(String[] args) {
		CountTheNumberOfObjectsFromClass obj1 = new CountTheNumberOfObjectsFromClass();
		CountTheNumberOfObjectsFromClass obj2 = new CountTheNumberOfObjectsFromClass();
		//CountTheNumberOfObjectsFromClass obj3 = new CountTheNumberOfObjectsFromClass();
		CountTheNumberOfObjectsFromClass obj4 = new CountTheNumberOfObjectsFromClass();
		CountTheNumberOfObjectsFromClass obj5 = new CountTheNumberOfObjectsFromClass();
		
		System.out.println("Objects are Created in this Class are :- "+count);
	}
}
