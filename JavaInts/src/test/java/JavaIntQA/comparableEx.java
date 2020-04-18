package JavaIntQA;

import java.util.*;
 class c1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSname().compareTo(o2.getSname());
	}
	
}
public class comparableEx {
	public static void main(String[] args) {
		ArrayList<Student> studs = new ArrayList<Student>();
		studs.add(new Student(65,"preethi","srm"));
		studs.add(new Student(54,"divya","svc"));
		studs.add(new Student(21,"jyothi","vrk"));
		studs.add(new Student(6,"archu","del"));
		studs.add(new Student(62,"swethu","viz"));
		Collections.sort(studs);
		for(Student s: studs) {
			System.out.println(s.getSno());
		}
		
		Collections.sort(studs, new c1());
		
		for(Student s: studs) {
			System.out.println(s.getSname());
		}
	}
}
