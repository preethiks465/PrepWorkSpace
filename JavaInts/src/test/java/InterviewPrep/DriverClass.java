package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DriverClass {

	public static void main(String[] args) {
		List<EmployeeClass> emplist = new ArrayList<EmployeeClass>();
		emplist.add(new EmployeeClass(1, "pree", 67000));
		emplist.add(new EmployeeClass(10, "kree", 90000));
		emplist.add(new EmployeeClass(16, "sans", 450));
		emplist.add(new EmployeeClass(41, "gk", 10000000));
		emplist.add(new EmployeeClass(18, "gsk", 7777));
		System.out.println("********Before Sorting***********");
		Iterator<EmployeeClass> it = emplist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getEmpid());
		}
		System.out.println("******** After Sorting***********");
		Collections.sort(emplist);
		emplist.forEach(emp -> System.out.println(emp.getEmpid()));

		System.out.println("******** Sorting Reverse ***********");
		Collections.reverse(emplist);
		emplist.forEach(emp -> System.out.println(emp.getEmpid()));

		System.out.println("******** Sorting EmpName using Comparator ***********");
		Collections.sort(emplist, new EmpnameCmp());
		emplist.forEach(emp -> System.out.println(emp.getEmpname()));

		System.out.println("******** Reverse Sorting EmpName using Comparator ***********");
		Collections.sort(emplist, Collections.reverseOrder(new EmpnameCmp()));
		emplist.forEach(emp -> System.out.println(emp.getEmpname()));
	}

}
