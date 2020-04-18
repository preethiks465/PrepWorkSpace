package InterVExp;

public class Employee implements Comparable<Employee> {
	private String Empname;
	private int Empid;
	private String Job;

	Employee(String Empname, int Empid, String Job) {
		this.Empname = Empname;
		this.Empid = Empid;
		this.Job = Job;
	}

	public String getEmpname() {
		return Empname;
	}

	public String getJob() {
		return Job;
	}

	public int getEmpid() {
		return Empid;
	}

	@Override
	public int compareTo(Employee o) {
		return (this.getEmpname().compareTo(o.getEmpname()));

	}

}
