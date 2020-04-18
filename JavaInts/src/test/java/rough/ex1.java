package rough;

class ex1{
	public static void intex(int a,int b) {
		int result = a-b;
		try {
		if(result<0) {
			throw new NegativeIntegerException("Negative Number Exception");
		} 
		}
		catch(Exception e) {
			System.out.println("hello");
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[]args) {
		intex(3,5);
	}
}