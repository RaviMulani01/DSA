package search.algo;

public class BinarySearch2DMetrix {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };

	        int target = 1;

	        searchMatrix(matrix, target);
	        
	       

	}

	public static void searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
        	
            int mid = left + (right - left) / 2;
            
            int n = mid/cols;
            int m = mid%cols;

            if (matrix[n][m] == target) {
                System.out.println( "Target found at: (" +  n + ", " + m + ") Poistion");
                return;
            } else if (matrix[n][m] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target Not Found!!");
        return;
    }

}
