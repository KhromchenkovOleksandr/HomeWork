import java.util.Scanner;

public class arrayViceVersa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix m : ");
        int n = scanner.nextInt();
        int sum = 0;

        int[] matrix = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter element [" + i + "]");
            matrix[i] = scanner.nextInt();

        }

        System.out.println("Original array is : ");
        for (int i = 0; i < n; i++) {

            System.out.print(matrix[i] + " ");
        }
       System.out.println();


        System.out.println("Vice versa array is : ");
        for (int i = n-1; i >= 0; i--) {

            System.out.print(matrix[i] + " ");

        }


    }
}