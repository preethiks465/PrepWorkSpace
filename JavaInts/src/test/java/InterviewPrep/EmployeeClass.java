package InterviewPrep;

public class EmployeeClass implements Comparable<EmployeeClass> {

	private int empid;
	private String empname;
	private float empsal;

	public EmployeeClass(int empid, String empname, float empsal) {
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getEmpsal() {
		return empsal;
	}

	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}

	@Override
	public int compareTo(EmployeeClass e1) {

		return this.empid - e1.getEmpid();
	}

	@Override
	public int hashCode() {
		return this.empid;

	}

	@Override
	public boolean equals(Object obj) {
		EmployeeClass emp = (EmployeeClass) obj;
		return (emp.getEmpid() == this.empid && emp.getEmpname().contentEquals(this.empname)
				&& emp.getEmpsal() == this.empsal);

	}
	@Override
	public String toString() {
		return this.empname+" "+this.empid+" "+this.empsal;
	}
}
