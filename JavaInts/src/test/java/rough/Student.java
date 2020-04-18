package rough;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name :" + name + " Age :" + age;

	}

	@Override
	public int compareTo(Student s1) {

		return this.name.compareTo(s1.name);
	}

	public static Comparator<Student> cmp = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			int namecmp = s1.getName().compareTo(s2.getName());
			int agecmp = s1.getAge().compareTo(s2.getAge());
			if (namecmp == 0) {
				return ((agecmp == 0) ? namecmp : agecmp);
			} else

				return namecmp;
		}

	};
}
