package JavaIntQA;

import java.io.Serializable;

public class Student implements Comparable<Student>{
	private int sno;
	private String sname;
	private String collgename;
	Student(int no,String name,String col){
		sno=no;
		sname=name;
		collgename=col;
	}
public int getSno() {
	return sno;
	
}
	public void setSno(int sno) {
		this.sno=sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCollgename() {
		return collgename;
	}
	public void setCollgename(String collgename) {
		this.collgename = collgename;
	}
	@Override
	public int compareTo(Student o) {
		if (this.sno> o.sno) {
			return 1;
		}
		else
			return -1;
	}
}
