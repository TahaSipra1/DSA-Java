
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        // Start timer
        long startTime = System.nanoTime();

        // Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        // Stop timer
        long endTime = System.nanoTime();

        // Display sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calculate execution time
        double timeTaken = (endTime - startTime) / 1_000_000.0;

        System.out.println("\n\nTotal Elements: " + arr.length);
        System.out.println("Execution Time: " + timeTaken + " milliseconds");
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}