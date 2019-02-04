package algorithm;
/*
https://www.youtube.com/watch?v=SLauY6PpjW4
https://www.youtube.com/watch?v=Fiot5yuwPAg


Step 1: Pick a pivot value
Step 2: Split array to 2 sections
Step 3: sort two sections

 */

public class QuickSort {
    public static void sort(int[] array) {

        quicksort(array, 0, array.length - 1);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        // step 1: pick a pivot value
        int pivotValue = array[(left + right) / 2];

        // Step 2: Split array to 2 sections
        int index = partition(array, left, right, pivotValue);

        // Step 3: recursion
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivotValue) {
        while (left <= right) {
            while (array[left] < pivotValue) {
                left++;
            }

            while (array[right] > pivotValue) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
