package week1.day2;

public class EmployeeDetails {
public void EmployeeName() {
	String EmployeeName="Ramesh";
	int employeeId=2443;
	System.out.println("Employee Name="+EmployeeName);
	System.out.println("employee Id="+employeeId);
}
public void EmployeeAddress() {
	String EmployeeAddress="Trichy";
	System.out.println("Employee Address="+EmployeeAddress);
}
public void EmployeeSalary() {
	float EmployeeSalary=29700.89f;
	System.out.println("Employee Salary="+EmployeeSalary);
}
public void EmployeeMobileNO() {
	long EmployeeMobileNo=9876543210l;
	System.out.println("Employee Mobile No="+EmployeeMobileNo);
}
public static void main(String[] args)
{
	EmployeeDetails details=new EmployeeDetails();
	details.EmployeeName();
	details.EmployeeAddress();
	details.EmployeeSalary();
	details.EmployeeMobileNO();
}
}