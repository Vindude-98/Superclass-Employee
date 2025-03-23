
public class Main {

	public static void main(String[] args) {
		
		// Employee inheritance example
		Employee employee = new Employee();
		
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setEmployeeID(9999);
		employee.employeeSummary();
		System.out.println();
		
		// Manager inheritance example
		Manager manager = new Manager();
		
		manager.setFirstName("Jane");
		manager.setLastName("Smith");
		manager.setEmployeeID(1111);
		manager.employeeSummary();
	}
}
