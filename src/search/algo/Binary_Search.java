package search.algo;

public class Binary_Search {
	public static void main(String[] args) {

		int a[] = {1, 3, 5, 6, 8, 9, 15};
		int target = 6;
		
//		Helper variable for recursive binary search
//		int left = 0;
//		int right = a.length -1;

		int result = binarySearch(a, target);
		//Recursive binary search
//		int result = recursiveBinarySearch(a, target, left, right);

		if (result != -1) {
			System.out.println("Target Value Found At Index: " + result);}
		else {
			System.out.println("Target is not found!");}
	}

	private static int binarySearch(int[] a, int target) {
		int left = 0;
		int right = a.length -1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(a[mid] == target) {
				return mid;
			}
			
			else if(a[mid] < target) {
				left = mid +1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	// Helper function for recursive binary search
	public static int recursiveBinarySearch(int[] a, int target, int left, int right) {
		while(left<=right) {	
			int mid = (left + right)/2;
			if(a[mid] == target) {
				return mid;
			}
			
			else if(a[mid] < target) {
				return recursiveBinarySearch(a, target, mid + 1, right);
			}
			
			else {
				return recursiveBinarySearch(a, target, left, mid - 1);
			}
		}
		return -1;
	}

}
