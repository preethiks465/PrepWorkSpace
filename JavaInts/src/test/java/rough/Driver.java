package rough;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("Ajay",30));
		slist.add(new Student("pranav",40));
		slist.add(new Student("Charan",50));
		slist.add(new Student("Ajay",25));
		slist.add(new Student("pranav",15));
		slist.add(new Student("kunal",23));
		slist.add(new Student("Amar",54));
		
		//Collections.sort(slist);
		Collections.sort(slist, Student.cmp);
		for(Student s: slist) {
			System.out.println(s);
		}
	}

}
