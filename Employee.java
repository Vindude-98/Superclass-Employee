
public class Employee {

	String firstName;
	String lastName;
	int employeeID;
	double Salary;
	
	public Employee() {
		Salary = 0;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
		
	public void employeeSummary() {
		System.out.println("Employee Info");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("EmployeeID: " + employeeID);
	}
	
}
