import java.util.Scanner;


public class Ask_until_0  {
    public static void main(String[] args) {


        int a;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number A");
             a = scanner.nextInt();

        } while (a!=0);
        System.out.println("End of program Number = 0");
    }

}
