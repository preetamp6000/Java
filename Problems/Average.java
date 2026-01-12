// Average of Marks
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Marks of 4 Subjescts");

        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        int d=r.nextInt();

        int sum= a+b+c+d;
        System.out.println("Total Marks :" + sum);

        double avg= sum/4;
        System.out.println("Average :" + avg);
    }
    
}
