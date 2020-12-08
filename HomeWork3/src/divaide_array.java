
import java.util.Scanner;

public class divaide_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix m : ");
        int n = scanner.nextInt();
        int k = 0;
        int j = 0;
        int a = 0;
        int y = 0;
        int[] array = new int[n];//????????
        // ініціалізація масиву
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + i + "]");
            array[i] = scanner.nextInt();
        }

        //виводимо масив на екран та визначаеми кількість додатніх та відемних елементів
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            if(array[i]<0)
                k++;

            if(array[i]>0)
                j++;

            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
       // System.out.println(k + " "+j); визначеняя разірі нових масивів

        int[] array1 = new int[k]; //оголошуемо та створюемо новий масив
        int[] array2 = new int[j];

        for (int i = 0; i < n; i++) {
            if(array[i]<0){
                array1[a] = array[i];
                a++;
            }
            if(array[i]>0){
                array2[y] = array[i];
                y++;
            }

        }
        System.out.print("Matrix with negative elements is : ");
        for (int i = 0; i < k; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");

       System.out.print("Matrix with positive elements is : ");
        for (int i = 0; i < j; i++) {
            System.out.print(array2[i] + " ");
        }
      /*  System.out.println("Matrix Array1: ");
        for (int i = 0; i < k; i++) {
            if(array1[i]>0)
                k++;

            if(array[i]>0)
                j++;

            System.out.print(array[i] + " ");
        }*/


      /*   int[] array2 = new int[j];
        for (int i = 0; i < j; i++) {
            if(array1[i]<0){
                array2[j] = array[i];
            }
        }*/




    }
}