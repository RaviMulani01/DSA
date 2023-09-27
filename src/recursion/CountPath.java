package recursion;

public class CountPath {
	public static int countPath(int i, int j, int n, int m) {
		if(i == n || j == m) {
			return 0;
		}
		
		if(i == n-1 && j == m-1) {
			return 1;
		}
		//move downside
		int downmove = countPath(i+1, j, n, m);
		
		//move right side
		int rightmove = countPath(i, j+1, n, m);
		
		return downmove + rightmove;
	}

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		
		int count = countPath(0, 0, n, m);
		
		System.out.println("Total path is: " + count);
		
	}
}
