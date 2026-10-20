
import java.util.Random;

public class Bubblesort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        // Start timer
        long startTime = System.nanoTime();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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