package in.thiru.hasarelation.demo;

public class Employee {

	int empId;
	String empName;
	double empSal;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void dislay() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}

}
