package rough;

public class Employee {
	private int empid;

	Employee(int empid) {
		this.empid = empid;
	}

	@Override
	public int hashCode() {
		return empid;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}

}