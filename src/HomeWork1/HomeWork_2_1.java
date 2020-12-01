

import java.util.Scanner;

public class HomeWork_2_1

{

    public static void main(String[] args)
    {
        // ініціалізуємо змінну scanner один раз..
        // кожен виклик методів nextInt(), nextDouble(), next()
        // дозволяє нам вводити наступне значення з клавіатури.
        // Приклад нижче.
        Scanner scanner = new Scanner(System.in);
        System.out.println("let`s solve the equation  ax²+bx+c=0" );

        System.out.println("Enter number 'a'");
        int a = scanner.nextInt();

        System.out.println("Enter number 'b'");
        int b = scanner.nextInt();

        System.out.println("Enter number 'c'");
        int c = scanner.nextInt();

        int D = b*b-4*a*c;

        if (D == 0 )
        {
            double x1 = -b/2*a;
            System.out.println("the single solve is:") ;
            System.out.println(x1) ;

        }
         else if (D>0)
            {
             double x1 ;
             x1 =  ((-b+Math.sqrt (D))/2*a );
             double x2;
             x2 = ((-b-Math.sqrt (D))/2*a );
                System.out.println("the first solve is:") ;
                System.out.println(x1) ;
                System.out.println("the second solve is:") ;
                System.out.println(x2) ;
            }
         else
         {
             System.out.println("The solves is not exist");

         }

    }
    public static void main1(String[] args){

    }

}