package InterVExp;

import java.util.Comparator;

public class EmpJobComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee ej1, Employee ej2) {
		
		return (ej1.getJob().compareTo(ej2.getJob()));
	}

}
