package ch16;

public class Employee {

	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	//새로운 사원마다 새로운 사번
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
}
