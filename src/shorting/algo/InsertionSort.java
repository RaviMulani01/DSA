package shorting.algo;

public class InsertionSort {


	   public static void main(String args[]) {
	       int arr[] = {5, 12, 2, 4, 1};
	       insertionSort(arr);
	       printArray(arr);
	   }
	   
	   public static void insertionSort(int[] arr) {
		 //insertion sort
	       for(int i=1; i<arr.length; i++) {
	           int current = arr[i];
	           int j = i - 1;
	               while(j >= 0 && arr[j] > current) {
	                   //Keep swapping
	                   arr[j+1] = arr[j];
	                   j--;
	               }
	           arr[j+1] = current;
	       }
		
	   }

	   //print array
		public static void printArray(int arr[]) {
		       for(int i=0; i<arr.length; i++) {
		           System.out.print(arr[i]+" ");
		       }
		       System.out.println();
		   }

}
