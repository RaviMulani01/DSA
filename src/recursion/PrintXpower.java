package recursion;

public class PrintXpower {

	public static void main(String[] args) {
		int x = 2, n = 5;
//		int output = printPowerwithhightN(x, n);
		int output = printPowerwithhightlogN(x, n);
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

	//Print x^n (with stack height = logn)
	private static int printPowerwithhightlogN(int x, int n) {
		if(x == 0) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		
		if(n%2 == 0) {// for even power
			return  printPowerwithhightlogN(x, n/2) * printPowerwithhightlogN(x, n/2);
		}
		
		else {// for odd power
			return printPowerwithhightlogN(x, n/2) * printPowerwithhightlogN(x, n/2) * x;
		}
		
	}

}
