package JavaIntQA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjCreation {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {
		Student stu = (Student) Class.forName("JavaIntQA.Student").newInstance();
		Student s1 = Student.class.newInstance();
		System.out.println("**********************************");
		// Creating object using constructor new instance method
		Constructor<Student> cons = Student.class.getConstructor();
		Student s2 = cons.newInstance();	
		System.out.println("**********************************");
		//Student s3 = (Student) s2.clone();
		//System.out.println(s3);
		System.out.println("**********************************");

		/*
		 * FileOutputStream fos = new FileOutputStream("Text.txt"); ObjectOutputStream
		 * Oos = new ObjectOutputStream(fos); Student s4 = new Student();
		 * Oos.writeObject(s4);
		 */
		
		FileInputStream fis = new FileInputStream("Text.txt");
		ObjectInputStream Ois = new ObjectInputStream(fis);
		Student s5 = (Student)Ois.readObject();
		System.out.println(s5);
	}
}
