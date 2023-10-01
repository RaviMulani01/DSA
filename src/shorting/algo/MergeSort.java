package shorting.algo;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point of the array
            int middle = (left + right) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int size1 = middle - left + 1;
        int size2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        // Copy data to temporary arrays leftArray[] and rightArray[]
        for (int i = 0; i < size1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < size2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        // Merge the two temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArray[]
        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArray[]
        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
