import java.util.Scanner;

public class ques3_2DArray_insert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // Taking array values from user
        System.out.println("Enter 9 values:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // Display original array
        System.out.println("Original Array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Taking position and value from user
        System.out.print("Enter row (0-2): ");
        int row = input.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = input.nextInt();

        System.out.print("Enter new value: ");
        int value = input.nextInt();

        // Insert value
        arr[row][col] = value;

        // Display updated array
        System.out.println("Array after insertion:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
