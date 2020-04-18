import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		Vector<String> alist = new Vector<>();
		alist.add("Hyd");
		alist.add("Vizag");
		alist.add("Tirupati");
		alist.add("Rjy");
		alist.add("abc");
		alist.add("abc1");
		alist.add("abc2");
		alist.add("abc3");
		alist.add("abc4");
		alist.add("abc5");
		alist.add("abc6");
		
		//final Iterator<String>it = alist.iterator();

		/*
		 * new Thread() {
		 * 
		 * @Override public void run() { //Iterator<String>it = alist.iterator();
		 * while(it.hasNext()) { System.out.println(it.next()); } }
		 * 
		 * }.run();
		 * 
		 * new Thread() {
		 * 
		 * public void run(){ System.out.println("adding don"); alist.add(0,"Don");
		 * 
		 * } }.run();
		 */
}

}