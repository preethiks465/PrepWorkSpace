
public class Prime1to100 {

	public static void main(String[] args) {

		String primes = "";
		for (int i = 2; i <= 100; i++) {
			int n = 1;
			int count = 0;
			while (n <= i) {
				if (i % n == 0) {
					count++;

				}
				n++;
			}
			if (count == 2) {
				primes = primes +" "+ i;
			}
		}
		System.out.println(primes);
	}

}
