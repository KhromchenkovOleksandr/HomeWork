import java.util.Scanner;

public class HomeWork_2_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.next();

        switch (password)
        {
            case "pass123": {
                System.out.println("User autorised succefull");
                break;
            }
            case "Admin": {
                System.out.println("User autorised as Administrator");
                break;
            }
            default: {
                System.out.println("Incorrect data");
                break;
            }
        }
    }
}
