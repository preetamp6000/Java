import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a year");
        int year;
        year=r.nextInt();

        if(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0))
        {
                System.out.println("Leap Year");
        }

        else{
            System.out.println("Not Leap Year");

        }
    }
}
