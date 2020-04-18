
//Method 1:
/*public class Print1to100WithOutLoop {
	static int i = 100;

	public static void main(String[] args) {
		if (i >= 0) {
			System.out.printf("%d ", i--);
			main(null);
		}

	}

}*/

public class Print1to100WithOutLoop {
	static int i = 100;

	public static void print(int i) {
		if (i >= 0) {
			System.out.printf("%d ", i--);
			print(i);
		}
	}

	public static void main(String[] args) {
		print(i);

	}

}
