package search.algo;

public class Linear_Search {
	public static void main(String[] args) {
		
		int a[] = { 2, 10, 20, 11, 5, 7 };
		int target = 200;

		int result = linearSearch(a, target);

		if (result != -1) {
			System.out.println("Target Value Found At Index: " + result);}
		else {
			System.out.println("Target is not found!");}
	}
	
	public static int linearSearch(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
	}
}