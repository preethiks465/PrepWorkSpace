package InterviewPrep;

public class Driver2 {
	public static void main(String[] args) {
		EmployeeClass e1 = new EmployeeClass(34,"krishna",890);
		EmployeeClass e2 = new EmployeeClass(35,"krishna",890);
		if(e1.equals(e2)) {
			System.out.println("Same");
		}
		else
			System.out.println("Not Same");
		System.out.println(e1);
	}
	
}
