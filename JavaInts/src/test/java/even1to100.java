
public class even1to100 {
	public static void main(String[] args) {
		String even = "";
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				even = even + " " + i;
			}

		}
		System.out.println(even);
	}

}
