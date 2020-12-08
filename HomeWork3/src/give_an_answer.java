import java.util.Scanner;

public class give_an_answer {
    public static void main(String[] args) {


        int a;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input ansver 8*9=?");
            a = scanner.nextInt();

        } while (a!=8*9);
        System.out.println("End of program.Anser is right");
    }

}