package epam;

public class Exceptionex {

	public static void main(String[] args) throws NegativeFormatException {
		int i = 10, j = 90;
		try {
		if ((i - j) < 0) {
				throw new NegativeFormatException("Negative Integer");
		} else

			System.out.println((i - j));
		}
		catch(NegativeFormatException e) {
			System.out.println(e);
		}
	}

}
