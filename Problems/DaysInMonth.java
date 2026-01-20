 import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month;
        Scanner r = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        month = r.nextInt();

        if (month == 1) {
            System.out.println("31 days");
        }
        else if (month == 2) {
            System.out.println("28 days");
        }
        else if (month == 3) {
            System.out.println("31 days");
        }
        else if (month == 4) {
            System.out.println("30 days");
        }
        else if (month == 5) {
            System.out.println("31 days");
        }
        else if (month == 6) {
            System.out.println("30 days");
        }
        else if (month == 7) {
            System.out.println("31 days");
        }
        else if (month == 8) {
            System.out.println("31 days");
        }
        else if (month == 9) {
            System.out.println("30 days");
        }
        else if (month == 10) {
            System.out.println("31 days");
        }
        else if (month == 11) {
            System.out.println("30 days");
        }
        else if (month == 12) {
            System.out.println("31 days");
        }
        else {
            System.out.println("Invalid month number");
        }

        r.close();
    }
}



// While loop

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int month;

        while (true) {
            System.out.print("Enter month number (1-12): ");
            month = r.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month number. Try again.");
            } else {
                break; // valid input, exit loop
            }
        }

        if (month == 2) {
            System.out.println("28 days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else {
            System.out.println("31 days");
        }

        r.close();
    }
}
