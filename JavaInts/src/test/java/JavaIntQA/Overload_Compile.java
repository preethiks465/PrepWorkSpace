package JavaIntQA;

public class Overload_Compile {

	public static void main(String[] args) {
		Overload_Compile c = new Overload_Compile();
		System.out.println(c.sum(20, 30));

	}

public int sum(int a,int b) {
	return a+b;
}
public double sum(double a,double b) {
	return a+b;
}
public float sum(float a,float b) {
	return a+b;
}
}
