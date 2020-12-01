
import java.util.Scanner;
public class HomeWork_2_2
{


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter day of week: ");
            String a = scanner.next();

            switch (a) {
                case "Monday": {
                    System.out.println("Should make task for Monday");
                    break;
                }

                case "Tuesday": {
                    System.out.println("Should make task for Tuesday");
                    break;
                }

                case "Wednesday": {
                    System.out.println("Should make task for Wednesday");
                    break;
                }

                case "Thursday": {
                    System.out.println("Should make task for Thursday");
                    break;
                }

                case "Friday": {
                    System.out.println("Should make task for Friday");
                    break;
                }

                case "Saturday": {
                    System.out.println("Should make task for Saturday");
                    break;
                }

                case "Sunday": {
                    System.out.println("Should make task for Sunday");
                    break;
                }

                default: {
                    System.out.println("Incorrect day");
                    break;
                }
            }


        }
    }

