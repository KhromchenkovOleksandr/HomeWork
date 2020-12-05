import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number ");
        int a = scanner.nextInt();
        if (a%2==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }
}
