package InterVExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpTest {
	public void testname() {
		String className = this.getClass().getSimpleName();
		System.out.println(className);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Preethi", 134, "Sr.Auto");
		Employee e2 = new Employee("Sreekanth", 92, "Sr.Auto");
		Employee e3 = new Employee("Krishna", 12, "Jr.QA");
		Employee e4 = new Employee("Divya", 54, "CEO");

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);

		Collections.sort(emplist);
		Collections.sort(emplist, new EmpJobComparator());
		for (Employee em : emplist) {
			System.out.println(em.getEmpname());
		}
		System.out.println("*****************************");
		for (Employee em : emplist) {
			System.out.println(em.getJob());
		}
		EmpTest e = new EmpTest();
		e.testname();

	}

}
