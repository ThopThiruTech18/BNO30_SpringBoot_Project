package in.thiru.hasarelation.demo1;

public class Employee {

	int empId;
	String empName;
	double empSal;
	
	

	public Employee(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void dislay() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}

}
