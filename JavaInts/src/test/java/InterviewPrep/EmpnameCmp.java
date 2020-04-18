package InterviewPrep;

import java.util.Comparator;

public class EmpnameCmp implements Comparator<EmployeeClass> {

	@Override
	public int compare(EmployeeClass e1, EmployeeClass e2) {

		return e1.getEmpname().compareTo(e2.getEmpname());
	}
}
