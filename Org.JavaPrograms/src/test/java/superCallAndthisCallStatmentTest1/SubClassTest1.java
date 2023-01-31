package superCallAndthisCallStatmentTest1;

public class SubClassTest1 extends SuperClassTest1{
	String studName;

	public SubClassTest1(String studId, String studName) {
		super(studId);
		this.studName = studName;
	}
	
	public void display() {
		System.out.println(studName+ " :- "+studId);
	}
}
