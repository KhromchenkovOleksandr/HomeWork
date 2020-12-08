import java.util.Scanner;



public class profitOfDepozit {
    public static void main(String[] args) {
        int m; //відсоткова ставка
        double n; //початкова сумма
        int k; // кількість років
        System.out.println("enter value of money");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("enter anтual procent");
        m = scanner.nextInt();
        System.out.println("quantity year");
        k = scanner.nextInt();
        for(int i = 0;i < k;i++){
            n+=n*m/100;
        }

        System.out.println(n);
    }

}