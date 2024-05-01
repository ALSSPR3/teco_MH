package basic.ch12;

public class Employee {

	private int employeeId;
	private String name;
	private String department;
	
	public Employee(String name) {
		this.name = name;
		this.employeeId = Company.empSerialNumber;
		Company.empSerialNumber++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
