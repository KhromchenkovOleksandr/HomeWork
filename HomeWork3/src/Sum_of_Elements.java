import java.util.Scanner;



public class Sum_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix m*: ");
        int n = scanner.nextInt();
           int sum = 0;

        int[] matrix = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter element [" + i + "]");
            matrix[i] = scanner.nextInt();

        }

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            // for ( int j = 0; j < m; j++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();



        for (int i = 0; i < n; i++) {

          sum += matrix[i];
        }

        System.out.print("Sum of elements is " + sum + "");

    }
}