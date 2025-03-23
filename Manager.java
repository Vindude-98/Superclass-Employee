
public class Manager extends Employee{

	String department = "a";
	
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Managing Department: " + department);
	}
}
