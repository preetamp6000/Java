import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        int sal;
        double tax;
 
        Scanner r = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        sal = r.nextInt();

        if (sal <= 10000) {
            tax = 0;
        } 
        else if (sal <= 50000) {
            tax = sal * 0.10;
        } 
        else {
            tax = sal * 0.20;
        }

        System.out.println("Salary = " + sal);
        System.out.println("Tax = " + tax);

        r.close();
    }
}


// while loop

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        int sal;
        double tax;
        Scanner r = new Scanner(System.in);

        // do-while loop for valid salary input
        do {
            System.out.print("Enter Salary (positive value): ");
            sal = r.nextInt();

            if (sal < 0) {
                System.out.println("Salary cannot be negative. Try again.");
            }
        } while (sal < 0);

        if (sal <= 10000) {
            tax = 0;
        } 
        else if (sal <= 50000) {
            tax = sal * 0.10;
        } 
        else {
            tax = sal * 0.20;
        }

        System.out.println("Salary = " + sal);
        System.out.println("Tax = " + tax);

        r.close();
    }
}