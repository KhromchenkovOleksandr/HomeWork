
import java.util.Scanner;



public class Cycles  {
    public static void main(String[] args) {

        int size =0 ;
        int a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 0;
        for (int i = 0; i<=n;i++)
        {
a = number;
            for ( int j = 0; j<a;j++) {

                System.out.print(a + j +" ");

            }
           number ++;

            System.out.println(" ");

        }



       /* System.out.println("Enter number A");
        int size = scanner.nextInt();
        int b=0;
        for (;a>0;a--)
        {
            b+=a;

        }
        System.out.print( b + " ");
        System.out.println("Enter number A1");
        int a1 = scanner.nextInt();
        int sum = 0;
        while (a1>=0) {
            sum += a1;
            a1--;
        }
        System.out.println( sum + " ");*/
    }
}