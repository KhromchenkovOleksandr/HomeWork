
import java.util.Scanner;

public class TwoDimentionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix m*n : ");
        int n = 5;
        int m = 7;

        int [][] Array = createArray(n,m);
        printArray(Array,n,m);

    }


    static int[][] createArray(int size1, int size2)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] Array = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {

               // System.out.print("Enter element [" + i + "][" + j + "] ");
               // Array[i][j] = scanner.nextInt();
                Array[i][j] =(int) (Math.random()*(75+2));

            }
        }

      return Array;
    }
    static void printArray(int [][] Array,int size1 , int size2) {

      /* System.out.println("Array  ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();

        }*/
        System.out.println("Random's Array is : ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


