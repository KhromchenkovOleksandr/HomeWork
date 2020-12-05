import java.util.Scanner;

public class Near_to_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number A");
        float a = scanner.nextFloat();
        System.out.println("Enter number B ");
        float b = scanner.nextFloat();
        float c = 10;
        int i;
        int k;
        if (a > c && b < c)
        {
            for (i = 0; a > c; i++) {
                a -= 0.1;

            }
            for (k = 0; b < c; k++) {
                b += 0.1;
            }
            if (i < k) {
                System.out.println("Variable A is near to 10");
            }
            else if (i == k) {
                System.out.println("Variable A and B is on the same steps to 10");
            }
            else {
                System.out.println("Variable B is near to 10");

            }
        }
        else if (a < c && b > c)
        {
            for (i = 0; a < c; i++) {
                a += 0.1;

            }
            for (k = 0; b > c; k++) {
                b -= 0.1;
            }
            if (i > k) {
                System.out.println("Variable B is near to 10");
            }
            else if (i == k) {
                System.out.println("Variable A and B is on the same steps to 10");
            }
            else {
                System.out.println("Variable A is near to 10");

            }
        }
        else if (a == b)
        {
            System.out.println("Variable A and B is on the same steps to 10");
        }
        else if (a < c && b < c)
        {
            if (a < b) {
                System.out.println("Variable B is near to 10");
            }
            else
                System.out.println("Variable A is near to 10");
        }
        else if (a > c && b > c)
        {
            if (a > b) {
                System.out.println("Variable B is near to 10");
            } else {
                System.out.println("Variable A is near to 10");

            }

        }

    }
}
