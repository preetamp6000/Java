import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Enter 3 numbers");
        Scanner r = new Scanner(System.in);

        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();

        int si = (a * b * c) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
