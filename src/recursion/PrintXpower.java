package recursion;

public class PrintXpower {

	public static void main(String[] args) {
		int x = 2, n = 5;
		int output = printPowerwithhightN(x, n);
		System.out.println(output);

	}

	//Print x^n (with stack height = n)
	private static int printPowerwithhightN(int x, int n) {
		if(x == 0) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		
		int result = x * printPowerwithhightN(x, n-1);
		return result;
	}

}
