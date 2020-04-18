package rough;

public class test {

	public static void main(String[] args) {
		Employee emp1 = new Employee(12);
		Employee emp2 = new Employee(12);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		if(emp1.equals(emp2)) {
			System.out.println("ttt");
		}
		else
			System.out.println("fff");

	}

}
