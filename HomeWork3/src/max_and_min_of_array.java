
import java.util.Scanner;

public class max_and_min_of_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix m*n : ");
        int n = scanner.nextInt();
        //int m = scanner.nextInt();
       // int Max = 0;
        //int Min = Max;

        int[] matrix = new int[n];
        // int Max = new int[k][b];
        //  int Min[k][b]; = new int[k][b];
        // int matrixMax = matrix[0][0];
        //int matrixMin = matrix[0][0];
        for (int i = 0; i < n; i++) {
            // for ( int j = 0; j < m; j++) {
            System.out.print("Enter element [" + i + "]");
            matrix[i] = scanner.nextInt();

        }

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            // for ( int j = 0; j < m; j++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();


         int Max = matrix[0];
        int Min = matrix[0];
        for (int i = 0; i < n; i++) {

            if (Max < matrix[i]) {
                Max = matrix[i];
            }
            if (Min > matrix[i]) {
                Min = matrix[i];
            }
        }
          /*  for (int i = n-1; i >=0; i--){

            if(Max>matrix[i])
                Min = matrix[i];
*/
        System.out.print("Maximum is [" + Max + "] Maximum is [" + Min + "]");

    }
}




