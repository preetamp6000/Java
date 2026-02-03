import java.util.Scanner;

public class PrimeOrNot{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n + 1)   // 1 + n for prime
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
