
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        // Start timer
        long startTime = System.nanoTime();

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

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
}