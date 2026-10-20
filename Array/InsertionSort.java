
import java.util.Random;

public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();


        // //////        Generate 1000 random num
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);

        }

        //     Start timer
        long startTime = System.nanoTime();

        //    /// Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Stop timer
        long endTime = System.nanoTime();

        // Display sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display execution time
        double timeTaken = (endTime - startTime) / 1_000_000.0;

        System.out.println("\n\nTotal Elements: " + arr.length);
        System.out.println("Execution Time: " + timeTaken + " milliseconds");
    }
}