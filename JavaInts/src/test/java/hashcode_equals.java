import java.util.HashMap;
import java.util.Map;

// https://www.youtube.com/watch?v=Nr56SlbMed4&list=PL3NrzZBjk6m8rEJ4O6Kpk_i1Ah8Le5Od-&index=8


public class hashcode_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		
		Map<Employee, String> hmap = new HashMap<Employee, String>();
		
		hmap.put(e1, "abc");
		hmap.put(e2, "abc");
		
		Map<Integer, String> hmap1 = new HashMap<Integer, String>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		hmap1.put(i1, "abc");
		hmap1.put(i2, "abc");
		
		System.out.println(hmap1.size());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(hmap.size());
	}

}

class Employee {
	int id;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
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
		if (id != other.id)
			return false;
		return true;
	}

	public Employee(int id) {
		this.id = id;
	}
}